package cadastropoo;
import model.PessoaFisica;
import model.PessoaFisicaRepo;
import model.PessoaJuridica;
import model.PessoaJuridicaRepo;
import java.util.Scanner;

public class Main {

    public static void limparTela() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PessoaFisicaRepo repoFisica = new PessoaFisicaRepo();
        PessoaJuridicaRepo repoJuridica = new PessoaJuridicaRepo();

        int opcao;
        int opcaoFisicaJuridica;

        do {
            System.out.println("Escolha uma opcao:");
            System.out.println("1 - Incluir");
            System.out.println("2 - Alterar");
            System.out.println("3 - Excluir");
            System.out.println("4 - Exibir pelo ID");
            System.out.println("5 - Exibir todos");
            System.out.println("6 - Salvar dados");
            System.out.println("7 - Recuperar dados");
            System.out.println("0 - Finalizar");
            opcao = scanner.nextInt();
            limparTela();

            switch (opcao) {
                case 1:
                    do {
                        System.out.println("Escolha uma opcao:");
                        System.out.println("1 - Pessoa Fisica");
                        System.out.println("2 - Pessoa Juridica");
                        System.out.println("0 - Voltar");
                        opcaoFisicaJuridica = scanner.nextInt();
                        limparTela();

                        if (opcaoFisicaJuridica == 1) {
                            PessoaFisica pf = new PessoaFisica(null, 0, 0, null);
                            System.out.println("Nome: ");
                            pf.setNome(scanner.next());
                            limparTela();
                            System.out.println("Id: ");
                            pf.setId(scanner.nextInt());
                            limparTela();
                            System.out.println("Idade: ");
                            pf.setIdade(scanner.nextInt());
                            limparTela();
                            System.out.println("CPF: ");
                            pf.setCpf(scanner.next());
                            limparTela();
                            System.out.println("Deseja Incluir Pessoa Fisica? \n");
                            pf.exibir();
                            System.out.println("\n1 - Sim");
                            System.out.println("0 - Nao");
                            opcaoFisicaJuridica = scanner.nextInt();

                            if (opcaoFisicaJuridica == 1) {
                                repoFisica.inserir(pf);
                            }
                            opcaoFisicaJuridica = 0;
                            limparTela();

                        }
                        if (opcaoFisicaJuridica == 2) {
                            PessoaJuridica pj = new PessoaJuridica(null, 0, null);
                            System.out.println("Nome: ");
                            pj.setNome(scanner.next());
                            limparTela();
                            System.out.println("Id: ");
                            pj.setId(scanner.nextInt());
                            limparTela();
                            System.out.println("CNPJ: ");
                            pj.setCnpj(scanner.next());
                            limparTela();
                            System.out.println("Deseja Incluir Pessoa Juridica? \n");
                            pj.exibir();
                            System.out.println("\n1 - Sim");
                            System.out.println("0 - Nao");
                            opcaoFisicaJuridica = scanner.nextInt();

                            if (opcaoFisicaJuridica == 1) {
                                repoJuridica.inserir(pj);
                            }
                            opcaoFisicaJuridica = 0;
                            limparTela();
                        }
                    } while (opcaoFisicaJuridica != 0);
                    break;
                case 2:
                    do {
                        System.out.println("Escolha uma opcao:");
                        System.out.println("1 - Pessoa Fisica");
                        System.out.println("2 - Pessoa Juridica");
                        System.out.println("0 - Voltar");
                        opcaoFisicaJuridica = scanner.nextInt();
                        limparTela();

                        if (opcaoFisicaJuridica == 1) {
                            PessoaFisica pf = new PessoaFisica(null, 0, 0, null);
                            int id = 0;
                            System.out.println("Qual o Id desejado? "); //dando merda aq
                            id = scanner.nextInt();
                            limparTela();
                            repoFisica.obter(id);
                            opcaoFisicaJuridica = 0;
                            System.out.println("");
                            System.out.println("Nome: ");
                            pf.setNome(scanner.next());
                            limparTela();
                            System.out.println("Id: ");
                            pf.setId(scanner.nextInt());
                            limparTela();
                            System.out.println("Idade: ");
                            pf.setIdade(scanner.nextInt());
                            limparTela();
                            System.out.println("CPF: ");
                            pf.setCpf(scanner.next());
                            limparTela();
                            System.out.println("Deseja Editar Pessoa Fisica? \n");
                            pf.exibir();
                            System.out.println("\n1 - Sim");
                            System.out.println("0 - Nao");
                            opcaoFisicaJuridica = scanner.nextInt();

                            if (opcaoFisicaJuridica == 1) {
                                repoFisica.alterar(id, pf);
                            }
                            opcaoFisicaJuridica = 0;
                            limparTela();

                        }
                        if (opcaoFisicaJuridica == 2) {
                            PessoaJuridica pj = new PessoaJuridica(null, 0, null);
                            int id = 0;
                            System.out.println("Qual o Id desejado? "); 
                            id = scanner.nextInt();
                            limparTela();
                            repoJuridica.obter(id);
                            opcaoFisicaJuridica = 0;
                            limparTela();
                            System.out.println("Nome: ");
                            pj.setNome(scanner.next());
                            limparTela();
                            System.out.println("Id: ");
                            pj.setId(scanner.nextInt());
                            limparTela();
                            System.out.println("CNPJ: ");
                            pj.setCnpj(scanner.next());
                            limparTela();
                            System.out.println("Deseja Editar Pessoa Juridica? \n");
                            pj.exibir();
                            System.out.println("\n1 - Sim");
                            System.out.println("0 - Nao");
                            opcaoFisicaJuridica = scanner.nextInt();

                            if (opcaoFisicaJuridica == 1) {
                                repoJuridica.alterar(id, pj);
                            }
                            opcaoFisicaJuridica = 0;
                            limparTela();
                        }
                    } while (opcaoFisicaJuridica != 0);
                    break;
                case 3:
                    do {
                        System.out.println("Escolha uma opcao:");
                        System.out.println("1 - Pessoa Fisica");
                        System.out.println("2 - Pessoa Juridica");
                        System.out.println("0 - Voltar");
                        opcaoFisicaJuridica = scanner.nextInt();
                        limparTela();

                        if (opcaoFisicaJuridica == 1) {

                            System.out.println("Qual o Id da Pessoa Física? ");
                            int id = scanner.nextInt();
                            limparTela();
                            repoFisica.obter(id);
                            System.out.println("Deseja Deletar Pessoa Fisica? \n");
                            System.out.println("\n1 - Sim");
                            System.out.println("0 - Nao");
                            opcaoFisicaJuridica = scanner.nextInt();
                            if (opcaoFisicaJuridica == 1) {
                                repoFisica.excluir(id);
                            }
                            opcaoFisicaJuridica = 0;
                            limparTela();

                        }
                        if (opcaoFisicaJuridica == 2) {
                            System.out.println("Qual o Id da Pessoa Juridica? ");
                            int id = scanner.nextInt();
                            limparTela();
                            repoJuridica.obter(id);
                            System.out.println("Deseja Deletar Pessoa Juridica? \n");
                            System.out.println("\n1 - Sim");
                            System.out.println("0 - Nao");
                            opcaoFisicaJuridica = scanner.nextInt();

                            if (opcaoFisicaJuridica == 1) {
                                repoJuridica.excluir(id);
                            }
                            opcaoFisicaJuridica = 0;
                            limparTela();
                        }
                    } while (opcaoFisicaJuridica != 0);
                    break;
                case 4:
                    do {
                        System.out.println("Escolha uma opcao:");
                        System.out.println("1 - Pessoa Fisica");
                        System.out.println("2 - Pessoa Juridica");
                        System.out.println("0 - Voltar");
                        opcaoFisicaJuridica = scanner.nextInt();
                        limparTela();

                        if (opcaoFisicaJuridica == 1) {

                            System.out.println("Qual o Id da Pessoa Física? ");
                            int id = scanner.nextInt();
                            limparTela();
                            repoFisica.obter(id);
                            System.out.println("\n0 - Voltar");
                            opcaoFisicaJuridica = scanner.nextInt();
                            opcaoFisicaJuridica = 0;
                            limparTela();

                        }
                        if (opcaoFisicaJuridica == 2) {
                            System.out.println("Qual o Id da Pessoa Juridica? ");
                            int id = scanner.nextInt();
                            limparTela();
                            repoJuridica.obter(id);
                            System.out.println("\n0 - Voltar");
                            opcaoFisicaJuridica = scanner.nextInt();
                            opcaoFisicaJuridica = 0;
                            limparTela();

                        }
                    } while (opcaoFisicaJuridica != 0);
                    break;
                case 5:
                    do {
                        System.out.println("Escolha uma opcao:");
                        System.out.println("1 - Pessoa Fisica");
                        System.out.println("2 - Pessoa Juridica");
                        System.out.println("0 - Voltar");
                        opcaoFisicaJuridica = scanner.nextInt();
                        limparTela();

                        if (opcaoFisicaJuridica == 1) {
                            repoFisica.obterTodos();
                            System.out.println("\n0 - Voltar");
                            opcaoFisicaJuridica = scanner.nextInt();
                            opcaoFisicaJuridica = 0;
                            limparTela();
                        }

                        if (opcaoFisicaJuridica == 2) {
                            repoJuridica.obterTodos();
                            System.out.println("\n0 - Voltar");
                            opcaoFisicaJuridica = scanner.nextInt();
                            opcaoFisicaJuridica = 0;
                            limparTela();
                        }
                    } while (opcaoFisicaJuridica != 0);
                    break;
                case 6:
                    do {
                        System.out.println("Escolha uma opcao:");
                        System.out.println("1 - Pessoa Fisica");
                        System.out.println("2 - Pessoa Juridica");
                        System.out.println("0 - Voltar");
                        opcaoFisicaJuridica = scanner.nextInt();
                        limparTela();

                        if (opcaoFisicaJuridica == 1) {

                            System.out.println("Qual o Prefixo Desejado? ");
                            String prefixo = scanner.next();
                            limparTela();
                            repoFisica.persistir(prefixo + ".fisica.bin");
                            System.out.println("\n0 - Voltar");
                            opcaoFisicaJuridica = scanner.nextInt();
                            opcaoFisicaJuridica = 0;
                            limparTela();
                        }

                        if (opcaoFisicaJuridica == 2) {
                            System.out.println("Qual o Prefixo Desejado? ");
                            String prefixo = scanner.next();
                            limparTela();
                            repoJuridica.persistir(prefixo + ".juridica.bin");
                            System.out.println("\n0 - Voltar");
                            opcaoFisicaJuridica = scanner.nextInt();
                            opcaoFisicaJuridica = 0;
                            limparTela();

                        }
                    } while (opcaoFisicaJuridica != 0);
                    break;
                case 7:
                    do {
                        System.out.println("Escolha uma opcao:");
                        System.out.println("1 - Pessoa Fisica");
                        System.out.println("2 - Pessoa Juridica");
                        System.out.println("0 - Voltar");
                        opcaoFisicaJuridica = scanner.nextInt();
                        limparTela();

                        if (opcaoFisicaJuridica == 1) {

                            System.out.println("Qual o Prefixo Desejado? ");
                            String prefixo = scanner.next();
                            limparTela();
                            repoFisica.recuperar(prefixo + ".fisica.bin");
                            System.out.println("\n0 - Voltar");
                            opcaoFisicaJuridica = scanner.nextInt();
                            opcaoFisicaJuridica = 0;
                            limparTela();

                        }

                        if (opcaoFisicaJuridica == 2) {
                            System.out.println("Qual o Prefixo Desejado? ");
                            String prefixo = scanner.next();
                            limparTela();
                            repoJuridica.recuperar(prefixo + ".juridica.bin");
                            System.out.println("\n0 - Voltar");
                            opcaoFisicaJuridica = scanner.nextInt();
                            opcaoFisicaJuridica = 0;
                            limparTela();

                        }
                    } while (opcaoFisicaJuridica != 0);
                    break;
                case 0:
                    System.out.println("Finalizando a execução.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

    }

}
