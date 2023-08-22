def menu():
    while True:
        print("[ 1 ] Converter codificação de caracteres (encoding) para UTF-8")
        print("[ 2 ] Substituir vírgula ',' por ponto e vírgula ';'")
        print("[ 3 ] Substituir ponto e vírgula ';' por vírgula ','")
        print("[ 4 ] Corrigir data para formato YYYY-MM-DD")
        print("[ 0 ] Sair")
        
        escolha = input("Escolha uma opção: ")
        
        if escolha == '1':
            converter_para_utf8()
        elif escolha == '2':
            substituir_virgula_por_ponto_e_virgula()
        elif escolha == '3':
            substituir_ponto_e_virgula_por_virgula()
        elif escolha == '4':
            corrigir_data_formato()
        elif escolha == '0':
            print("Saindo do programa.")
            break
        else:
            print("Opção inválida. Tente novamente.")
        
        continuar = input("Deseja continuar? (S/N): ")
        if continuar.upper() != 'S':
            print("Saindo do programa.")
            break

if __name__ == "__main__":
    menu()