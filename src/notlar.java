import java.util.Random;

public class notlar {
       /* for (int i = 0; i < this.map.length; i++) {

            for (int j = 0; j < this.map[0].length; j++) {

                mine = random.nextInt(3);

                if (flag < mineLimit && mine == 1) {

                    this.map[i][j] = "* ";
                    flag++;

                } else {
                    this.map[i][j] = "- ";
                }
            }
            System.out.println(flag);
        }
*/

    /* boolean isWin() {

     if ((this.map[rowSelect][colSelect]).equals("* ")) {

         System.out.println();
         System.out.println("Mayına bastınız!");
         return false;
     }
     return false;
 }*/
    public static void main(String[] args) {

      /*  Random random = new Random();

        String[][] map = new String[5][5];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {

                map[i][j] = "- ";
            }
        }


        for (int i = 0; i < 6; i++) {

            int a = random.nextInt(5);
            int b = random.nextInt(5);

            if (!(map[a][b].equals("* "))) {
                map[a][b] = "* ";
            } else {
                i--;
            }
        }




        Integer flag = 0;
int rowSelect=5,colSelect=3,rowNumber=6,colNumber=6;
String [][] map = new String [rowNumber][colNumber]
        if (rowSelect > 0 && rowSelect + 1 < rowNumber&& colSelect>0&& colSelect+1<colNumber){

            for (int i = rowSelect - 1; i < rowNumber + 2; i++) {
                for (int j = colSelect - 1; j < colSelect + 2; j++) {
                    if (map[i][j].equals("* ")) {
                        flag++;
                    }
                }
            }
            map[rowSelect][colSelect] = flag.toString();
        }

        for (String[] row:map) {

            for (String col:row) {
                System.out.print(col);
            }
            System.out.println();

        }
*/

          /*    if (this.colSelect == 0) {

                for (int j = this.colSelect; j < this.colSelect + 2; j++) {

                    if (this.map[i][j].equals("* ")) {
                        flag++;
                    }
                }

            }else if (this.colSelect == this.colNumber - 1) {

                    for (int j = this.colSelect - 1; j < this.colNumber ; j++) {
                        if (this.map[i][j].equals("* ")) {
                            flag++;
                        }
                    }

                } else {

                    for (int j = this.colSelect-1; j < this.colSelect + 2; j++) {
                        if (this.map[i][j].equals("* ")) {
                            flag++;
                        }
                    }
                }
*/


        /*   if ( == 0) {

            for (int i = control1; i < control1 + 2; i++) {


                if (control2 == 0) {

                    for (int j = control2; j < this.colSelect + 2; j++) {

                        if (this.map[i][j].equals("* ")) {
                            flag++;
                        }
                    }

                } else if (control2 == control2Num - 1) {

                    for (int j = control2 - 1; j < control2Num; j++) {
                        if (this.map[i][j].equals("* ")) {
                            flag++;
                        }
                    }

                }
               else{

                    for (int j = control2 - 1; j < control2 + 2; j++) {
                        if (this.map[i][j].equals("* ")) {
                            flag++;
                        }
                    }
                }
            }
        } else if (control1 == control1Num - 1) {
            for (int i = control1-1; i <control1Num ; i++) {
                if (control2 == 0) {

                    for (int j = control2; j < this.colSelect + 2; j++) {

                        if (this.map[i][j].equals("* ")) {
                            flag++;
                        }
                    }

                } else if (control2 == control2Num - 1) {

                    for (int j = control2 - 1; j < control2Num; j++) {
                        if (this.map[i][j].equals("* ")) {
                            flag++;
                        }
                    }

                }
                else{

                    for (int j = control2 - 1; j < control2 + 2; j++) {
                        if (this.map[i][j].equals("* ")) {
                            flag++;
                        }
                    }
                }
            }

        }*/
         /* if (this.rowSelect > 0 && rowSelect + 1 < rowNumber && colSelect > 0 && colSelect + 1 < colNumber) {

            for (int i = this.rowSelect - 1; i < this.rowSelect + 2; i++) {
                for (int j = this.colSelect - 1; j < this.colSelect + 2; j++) {
                    if (this.map[i][j].equals("* ")) {
                        flag++;
                    }
                }
            }
        } else */

        /*else if (this.rowSelect == 0) {
for (int i = this.rowSelect; i < this.rowSelect + 2; i++) {

                rowCheck(i);
            }


        } else if (this.rowSelect == this.rowNumber - 1) {

            for (int i = this.rowSelect - 1; i < this.rowNumber; i++) {

                rowCheck(i);

            }

        } else if (this.colSelect==0) {

            for (int i = colSelect; i <colSelect+2 ; i++) {
                for (int j = 0; j < ; j++) {

                }
            }

        }else {
            for (int i = rowSelect-1; i <rowSelect+2 ; i++) {

            }
        }*/

    }
}

