package tietorakenneesimerkki;

public class KuplaLajitteluAlgoritmi {
    public static void main(String[] args) {
        int[] arvot = { 8, 3, 9, 2, 1 };
        boolean vaihtotehty = true;

        while (vaihtotehty) {
            vaihtotehty = false;
            for (int i = 0; i < arvot.length - 1; i++) {
                if (arvot[i] > arvot[i + 1]) {
                    // ARVOT SAADAAN VAIHDETTUA, MUTTA
                    // EI VOIDA MENETTÄÄ ENTISIÄ ARVOJA
                    // TARVITAAN TEMP MUUTTUJA
                    int temp = arvot[i];
                    arvot[i] = arvot[i + 1];
                    arvot[i + 1] = temp;
                    vaihtotehty = true;

                }
            }
        }
        for (int i = 0; i < arvot.length; i++) {
            System.out.println(arvot[i]);
        }
    }
}
