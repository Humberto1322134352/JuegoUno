import java.util.Scanner;


        public class juegoUno {
            static int cantidadJugadores;
            static int Player1[] = new int[8 ];
            static int Player2[] = new int[8];
            static int Player3[] = new int[8];
            static int Player4[] = new int[8];
            static int Mano[] = new int[120];

            public static void main(String[] args) {

                Scanner modo = new Scanner(System.in);
                System.out.println("Selecciona el modo de juego \n 1.- Modo con amigos \n 2.- Modo solitario");
                int modoJuego = modo.nextInt();

                if (modoJuego == 1) {

                    System.out.println("El modo seleccionado es \n 1.- Modo con amigos");
                    Scanner jugadores = new Scanner(System.in);

                    System.out.println("Selecciona la cantidad de jugadores maximo 4 jugadores");
                    cantidadJugadores = jugadores.nextInt();
                    if (cantidadJugadores > 1) {
                        if (cantidadJugadores <= 4) {
                            // jugadores();
                            repartirCartas();
                            // partida();

                        }

                    } else {
                        System.out.println("Cantidad de jugadores no permitida");
                    }
                }
            }

            public static void barajaear() {
                for (int i = 0; i < Mano.length; i++) {
                    Mano[i] = (int) (Math.random() * 11) + 0;
                    // System.out.print(" " + cartasAsignadas[i]);
                }
            }

            public static void repartirCartas() {
                barajaear();
                switch (cantidadJugadores) {
                    case 1:
                        System.out.println("No se puede");
                    case 2:
                        System.out.println("Esta son tus cartas jugador 1");
                        for (int i = 1; i <= 7; i++) {
                            Player1[i] = Mano[i];
                            System.out.println(" Carta " + i + " : " + Player1[i]);
                        }
                        System.out.println("Esta son tus cartas jugador 2");
                        for (int i = 1; i <= 7; i++) {
                                Player2[i] = Mano[i];
                                System.out.println(" Carta " + i + " : " + Player2[i]);
                        }
                        break;
                    case 3:
                        System.out.println("Esta son tus cartas jugador1");
                        for (int i = 1; i <= 7; i++) {
                            Player1[i] = Mano[i];
                            System.out.println(" Carta " + i + " : " + Player1[i]);
                        }
                        System.out.println("Esta son tus cartas jugador 2");
                        for (int i = 1; i <= 7; i++) {
                                Player2[i] =Mano [i];
                            System.out.println(" Carta " + i + " : " + Player2[i]);
                        }
                        System.out.println("Esta son tus cartas jugador 3");
                        for (int i = 1; i <= 7; i++) {
                            Player3[i] = Mano[i];
                            System.out.println(" Carta " + i + " : " + Player3[i]);
                        }
                    case 4:
                        System.out.println("Esta son tus cartas jugador1");
                        for (int i = 1; i <= 7; i++) {
                            Player1[i] = Mano[i];
                            System.out.println(" Carta " + i + " : " + Player1[i]);
                        }
                        System.out.println("Esta son tus cartas jugador 2");
                        for (int i = 1; i <= 7; i++) {
                            Player2[i] = Mano[i];
                            System.out.println(" Carta " + i + " : " + Player2[i]);
                        }
                        System.out.println("Esta son tus cartas jugador 3");
                        for (int i = 1; i <= 7; i++) {
                            Player3[i] = Mano[i];
                            System.out.println(" Carta " + i + " : " + Player3[i]);
                        }
                        System.out.println("Esta son tus cartas jugador 4");
                        for (int i = 1; i <= 7; i++) {
                            Player4[i] = Mano[i];
                            System.out.println(" Carta " + i + " : " + Player4[i]);
                        }

                }
            }
        }


