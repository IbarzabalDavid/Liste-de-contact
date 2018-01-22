import java.util.Scanner;

/**
 * Created by ibada1731710 on 2018-01-22.
 */
public class main {
    public static void main(String[] args) {

        int choix=0;
        int nbContact=0;
        boolean ok=false;
        Conctact[] tabContact=new Conctact[20];
        Scanner sc=new Scanner(System.in);


        System.out.println("LISTE DE CONTACTS");
        System.out.println("------------------------");
        while (choix!=4){
            System.out.println("1- Ajouter un contact");
            System.out.println("2- Modifier un contact");
            System.out.println("3- Afficher les contacts");
            System.out.println("4- Quitter");
            System.out.println("Que souhaitez-vous faire?");
            choix=sc.nextInt();

            switch (choix){
                case 1:
                    tabContact[nbContact] = new Conctact();
                    nbContact++;
                    Adresse monAddresse = new Adresse();
                    Occupation monOccupation =new Occupation();
                    Entreprise monEntreprise =new Entreprise();

                    System.out.println("Ce contact sera entré à la position #"+nbContact);
                    System.out.println("Veuillez entrer les informations suivantes :");

                    System.out.println("Prénom :");
                    tabContact[nbContact-1].setNom(sc.next());
                    System.out.println("Nom :");
                    tabContact[nbContact-1].setNomFamille(sc.next());

                    System.out.println("Adresse :");
                    System.out.println("  Numéro de porte");
                    monAddresse.setNumPorte(sc.next());
                    System.out.println("  Rue :");
                    monAddresse.setRue(sc.next());
                    System.out.println("  Appartement :");
                    monAddresse.setAppart(sc.next());
                    System.out.println("  Ville :");
                    monAddresse.setVille(sc.next());
                    System.out.println("  Province :");
                    monAddresse.setProvince(sc.next());
                    System.out.println("  Pays :");
                    monAddresse.setPays(sc.next());

                    System.out.println("Occupation :");
                    System.out.println("  Poste :");
                    monOccupation.setPoste(sc.next());
                    System.out.println("  Entreprise :");
                    System.out.println("    Nom :");
                    monEntreprise.setNomJob(sc.next());

                    monOccupation.setJob(monEntreprise);



                    tabContact[nbContact-1].setAdd(monAddresse);
                    tabContact[nbContact-1].setOcc(monOccupation);

                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("ByeBye!");
                    break;
                default:
                    System.out.println("Entrez une réponse valide SVP");

            }
        }
        sc.close();

    }
}
