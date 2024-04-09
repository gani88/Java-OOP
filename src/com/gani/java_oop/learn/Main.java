package com.gani.java_oop.learn;

public class Main {
    public static void main(String[] args) {
        //System.out.println(jalan("E23","AARAAAA"));
        jalan("E23","AARAAAA");
    }


    public static void jalan(String titikAwal, String langkah){
        int panjangLangkah = langkah.length();
        char arahAwal = titikAwal.charAt(0);
        int xAwal = Integer.parseInt(String.valueOf(titikAwal.charAt(1)));
        int yAwal = Integer.parseInt(String.valueOf(titikAwal.charAt(2)));
        int x = xAwal;
        int y = yAwal;

        String arah = "";
        for (int i = 0; i < panjangLangkah; i++) {
            char jalan = langkah.charAt(i);
            //System.out.println(jalan);
            if (i == 0){
                switch (arahAwal){
                    case 'E':
                        arah = String.valueOf(Arah.EAST);
                        break;
                    case 'S':
                        arah = String.valueOf(Arah.SOUTH);
                        break;
                    case 'W':
                        arah = String.valueOf(Arah.WEST);
                        break;
                    case 'N':
                        arah = String.valueOf(Arah.NORTH);
                        break;
                    default:
                        System.out.println("Anda salah memasukkan arah awal!!!");
                        break;
                }
                //pemeriksaan x dan y awal
                switch (arah){
                    case "EAST":
                        if(jalan == 'A'){
                            x = xAwal + 1;
                        } else if (jalan == 'R'){
                            arah = String.valueOf(Arah.EAST.r());
                        } else if (jalan == 'L'){
                            arah = String.valueOf(Arah.EAST.l());
                        } else {
                            System.out.println("Perintah yang anda masukkan gk masuk akal");
                            break;
                        }
                        break;
                    case "SOUTH":
                        if(jalan == 'A'){
                            y = yAwal - 1;
                        } else if (jalan == 'R'){
                            arah = String.valueOf(Arah.SOUTH.r());
                        } else if (jalan == 'L'){
                            arah = String.valueOf(Arah.SOUTH.l());
                        } else {
                            System.out.println("Perintah yang anda masukkan gk masuk akal");
                            break;
                        }
                        break;
                    case "WEST":
                        if(jalan == 'A'){
                            x = xAwal - 1;
                        } else if (jalan == 'R'){
                            arah = String.valueOf(Arah.WEST.r());
                        } else if (jalan == 'L'){
                            arah = String.valueOf(Arah.WEST.l());
                        } else {
                            System.out.println("Perintah yang anda masukkan gk masuk akal");
                            break;
                        }
                        break;
                    case "NORTH":
                        if(jalan == 'A'){
                            y = yAwal + 1;
                        } else if (jalan == 'R'){
                            arah = String.valueOf(Arah.WEST.r());
                        } else if (jalan == 'L'){
                            arah = String.valueOf(Arah.WEST.l());
                        } else {
                            System.out.println("Perintah yang anda masukkan gk masuk akal");
                            break;
                        }
                        break;
                }
                System.out.println(arah+" "+jalan+" -> "+"("+x+","+y+")");
                continue;
            }
//pemeriksaan x dan y awal
            switch (arah){
                case "EAST":
                    if(jalan == 'A'){
                        x += 1;
                    } else if (jalan == 'R'){
                        arah = String.valueOf(Arah.EAST.r());
                    } else if (jalan == 'L'){
                        arah = String.valueOf(Arah.EAST.l());
                    } else {
                        System.out.println("Perintah yang anda masukkan gk masuk akal");
                        break;
                    }
                    break;
                case "SOUTH":
                    if(jalan == 'A'){
                        y -= 1;
                    } else if (jalan == 'R'){
                        arah = String.valueOf(Arah.SOUTH.r());
                    } else if (jalan == 'L'){
                        arah = String.valueOf(Arah.SOUTH.l());
                    } else {
                        System.out.println("Perintah yang anda masukkan gk masuk akal");
                        break;
                    }
                    break;
                case "WEST":
                    if(jalan == 'A'){
                        x -= 1;
                    } else if (jalan == 'R'){
                        arah = String.valueOf(Arah.WEST.r());
                    } else if (jalan == 'L'){
                        arah = String.valueOf(Arah.WEST.l());
                    } else {
                        System.out.println("Perintah yang anda masukkan gk masuk akal");
                        break;
                    }
                    break;
                case "NORTH":
                    if(jalan == 'A'){
                        y += 1;
                    } else if (jalan == 'R'){
                        arah = String.valueOf(Arah.WEST.r());
                    } else if (jalan == 'L'){
                        arah = String.valueOf(Arah.WEST.l());
                    } else {
                        System.out.println("Perintah yang anda masukkan gk masuk akal");
                        break;
                    }
                    break;
            }

            System.out.println(arah+" "+jalan+" -> "+"("+x+","+y+")");
        }
        //System.out.println(x + " ---- " + y + " ---- "+ arah);
        //return yAwal;
    }
}
