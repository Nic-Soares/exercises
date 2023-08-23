import os
import time

def criar_pasta_csv():
    if os.path.exists('csv_files'):
        print("A pasta 'csv_files' já existe.")
    else:
        os.makedirs('csv_files')
        print("A pasta 'csv_files' foi criada.")

    

def listar_arquivos_csv():
    return [file for file in os.listdir('csv_files') if file.endswith('.csv')]

def esperar_arquivos_csv(tempo_maximo_espera=20):
    tempo_inicio = time.time()

    print("Aguardando inclusão de arquivo csv...")

    while True:
        arquivos_csv = listar_arquivos_csv()
        if arquivos_csv:
            return arquivos_csv
        
        tempo_atual = time.time()
        tempo_passado = tempo_atual - tempo_inicio
        
        if tempo_passado >= tempo_maximo_espera:
            print("Tempo limite de espera excedido. Nenhum arquivo CSV encontrado.")
            return []

        time.sleep(1)  # Espera por 1 segundo antes de verificar novamente


def interagir_com_usuario(arquivos_csv):
    if not arquivos_csv:
        print("Coloque os arquivos .csv na pasta csv_files...")
    else:
        print(f"A pasta 'csv_files' contém os seguintes arquivos CSV: {', '.join(arquivos_csv)}")

        resposta = input("Deseja converter esses arquivos CSV para um formato X fictício? (S/N): ").strip().lower()

        if resposta == 's':
            converter_para_formato_x(arquivos_csv)
        elif resposta == 'n':
            print("Nenhum arquivo foi convertido.")
        else:
            print("Resposta inválida. Use 'S' para sim ou 'N' para não.")

def main():
    criar_pasta_csv()
    arquivos_csv = esperar_arquivos_csv()
    interagir_com_usuario(arquivos_csv)

if __name__ == "__main__":
    main()
