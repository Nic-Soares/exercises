import os
import glob
import chardet
import codecs
import shutil
import multiprocessing

# Função para analisar o encoding atual de um arquivo CSV
def analisar_encoding(arquivo_csv):
    resultado = chardet.detect(open(arquivo_csv, 'rb').read())
    encoding = resultado['encoding']
    return (arquivo_csv, encoding)

# Função para converter um arquivo CSV para UTF-8
def converter_para_utf8(arquivo_csv, encoding_anterior):
    if encoding_anterior == 'utf-8':
        print(f"Arquivo {arquivo_csv} já está em UTF-8. Ignorando a conversão.")
        return
    
    arquivo_temporario = arquivo_csv + '_temp'
    with codecs.open(arquivo_csv, 'r', encoding=encoding_anterior) as arquivo_origem, \
         open(arquivo_temporario, 'wb') as arquivo_destino:
        for linha in arquivo_origem:
            arquivo_destino.write(linha.encode('utf-8'))
    shutil.move(arquivo_temporario, arquivo_csv)

# Função para processar a conversão e exibição de resultados
def processar_conversao(arquivos_csv):
    num_nucleos = os.cpu_count()
    num_processos = max(int(num_nucleos * 0.75), 1)
    
    print(f"Número de núcleos a serem usados: {num_processos}")
    
    with multiprocessing.Pool(processes=num_nucleos) as pool:
        info_encoding_anterior = pool.map(analisar_encoding, arquivos_csv)

    print("Análise de encoding atual concluída.")
    
    with multiprocessing.Pool(processes=num_nucleos) as pool:
        pool.starmap(converter_para_utf8, [(arquivo, encoding) for arquivo, encoding in info_encoding_anterior])

    print("Conversão concluída.")
    
    with multiprocessing.Pool(processes=num_nucleos) as pool:
        info_encoding_apos = pool.map(analisar_encoding, arquivos_csv)

    for (arquivo_csv, encoding_anterior), (_, encoding_apos) in zip(info_encoding_anterior, info_encoding_apos):
        print(f"Arquivo: {os.path.basename(arquivo_csv)}")
        print(f"Encoding anterior: {encoding_anterior}")
        print(f"Encoding após a conversão: {encoding_apos}\n")
    
    print("Verificação de encoding após conversão concluída.")

# Verificar se a pasta "csv_files" existe
if os.path.exists("csv_files") and os.path.isdir("csv_files"):
    arquivos_csv = glob.glob("csv_files/*.csv")
    if arquivos_csv:
        print("Arquivos CSV encontrados na pasta:")
        for i, arquivo in enumerate(arquivos_csv):
            print(f"{i + 1}: {os.path.basename(arquivo)}")
        
        resposta = input("Gostaria de fazer a conversão dos arquivos? (1 para sim, 0 para não): ")
        if resposta == '1':
            processar_conversao(arquivos_csv)
        else:
            print("Conversão cancelada.")
    else:
        print("Não foram encontrados arquivos CSV na pasta.")
else:
    os.makedirs("csv_files")
    print("Pasta 'csv_files' criada. Por favor, abasteça a pasta com arquivos CSV.")
