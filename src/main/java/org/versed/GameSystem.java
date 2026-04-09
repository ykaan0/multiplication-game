package org.versed;

import java.util.Random;
import java.util.Scanner;

public class GameSystem {
    User user = new User();
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    private int number1;
    private int number2;
    private int result = 0;
    private int fakeAnswer1;
    private int fakeAnswer2;
    private int position;
    private String choice;
    private int choiceInt;
    private int score = 0;
    private int mistakes = 0;
    private String decision;
    private int decisionInt;
    private int control = 0;

    public void sign(){
        System.out.println("******************************************");
        System.out.println("Made by ykaan0");
        System.out.println("Version : 1.0");
        System.out.println();
    }
    
    public void play() {

        while (true) {
            number1 = random.nextInt(10);
            number2 = random.nextInt(10);
            fakeAnswer1 = random.nextInt(20);
            fakeAnswer2 = random.nextInt(20);
            result = number1 * number2;
            if (fakeAnswer1 == result || fakeAnswer2 == result) {
                while (true) {
                    fakeAnswer1 = random.nextInt(70);
                    fakeAnswer2 = random.nextInt(20);
                    if (fakeAnswer1 != result || fakeAnswer2 != result) {
                        break;
                    } else {
                        continue;
                    }
                }
            }
            System.out.println(number1 + " x " + number2 + "      Score : " + score + "  Mistakes : " + mistakes);
            position = random.nextInt(3) + 1;
            if (position == 1) {
                while (true) {
                    try {
                        System.out.println("1) " + result + " | 2) " + fakeAnswer1 + " | 3) " + fakeAnswer2);
                        System.out.print("- - > ");
                        choice = scanner.nextLine();
                        choiceInt = Integer.parseInt(choice);
                        if (choiceInt < 1 || choiceInt > 3) {
                            System.out.println("Invalid Answer");
                            continue;
                        } else {
                            break;
                        }
                    } catch (Exception e) {
                        System.out.println("Character Error");
                        continue;
                    }

                }

                if (choiceInt == 1) {
                    score++;
                    continue;
                } else {
                    mistakes++;
                    if (score != 0) {
                        score--;
                    }

                    if (mistakes == 3) {
                        System.out.println("Game Over... Score : " + score);
                        user.setScore(score);
                        while (true) {
                            try {
                                System.out.println("1 - Restart | 2 - Quit");
                                decision = scanner.nextLine();
                                decisionInt = Integer.parseInt(decision);
                            } catch (Exception e) {
                                System.out.println("Invalid");
                                continue;
                            }
                            if (decisionInt == 1) {
                                mistakes = 0;
                                score = 0;
                                control = 1;
                                break;
                            } else {
                                break;
                            }
                        }
                        if (control == 1) {
                            continue;
                        } else {
                            break;
                        }
                    }

                }

            } else if (position == 2) {
                while (true) {
                    try {
                        System.out.println("1) " + fakeAnswer1 + " | 2) " + result + " | 3) " + fakeAnswer2);
                        System.out.print("- - > ");
                        choice = scanner.nextLine();
                        choiceInt = Integer.parseInt(choice);
                        if (choiceInt < 1 || choiceInt > 3) {
                            System.out.println("Invalid Answer");
                            continue;
                        } else {
                            break;
                        }
                    } catch (Exception e) {
                        System.out.println("Character Error");
                        continue;
                    }

                }

                if (choiceInt == 2) {
                    score++;
                    continue;
                } else {
                    mistakes++;
                    if (score != 0) {
                        score--;
                    }
                    if (mistakes == 3) {
                        System.out.println("Game Over... Score : " + score);
                        user.setScore(score);
                        while (true) {
                            try {
                                System.out.println("1 - Restart | 2 - Quit");
                                decision = scanner.nextLine();
                                decisionInt = Integer.parseInt(decision);
                            } catch (Exception e) {
                                System.out.println("Invalid");
                                continue;
                            }
                            if (decisionInt == 1) {
                                control = 1;
                                mistakes = 0;
                                score = 0;
                                break;
                            } else {
                                break;
                            }
                        }
                        if (control == 1) {
                            continue;
                        } else {
                            break;
                        }
                    }

                }
            } else if (position == 3) {
                while (true) {
                    try {
                        System.out.println("1) " + fakeAnswer1 + " | 2) " + fakeAnswer2 + " | 3) " + result);
                        System.out.print("- - > ");
                        choice = scanner.nextLine();
                        choiceInt = Integer.parseInt(choice);
                        if (choiceInt < 1 || choiceInt > 3) {
                            System.out.println("Invalid Answer");
                            continue;
                        } else {
                            break;
                        }
                    } catch (Exception e) {
                        System.out.println("Character Error");
                        continue;
                    }

                }

                if (choiceInt == 3) {
                    score++;
                    continue;
                } else {
                    mistakes++;
                    if (score != 0) {
                        score--;
                    }
                    if (mistakes == 3) {
                        System.out.println("Game Over... Score : " + score);
                        user.setScore(score);
                        while (true) {
                            try {
                                System.out.println("1 - Restart | 2 - Quit");
                                decision = scanner.nextLine();
                                decisionInt = Integer.parseInt(decision);
                            } catch (Exception e) {
                                System.out.println("Invalid");
                                continue;
                            }
                            if (decisionInt == 1) {
                                mistakes = 0;
                                score = 0;
                                control = 1;
                                break;
                            } else {
                                break;
                            }
                        }
                        if (control == 1) {
                            continue;
                        } else {
                            break;
                        }
                    }

                }
            }

        }
    }
}
