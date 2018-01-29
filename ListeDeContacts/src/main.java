import java.util.Scanner;

/**
 * Created by ibada1731710 on 2018-01-22.
 */
public class main {
    public static void main(String[] args) {

        int choix=0;
        int i=0;
        int j=0;
        int nbContact=0;
        int choixModif=0;
        char rep='o';
        boolean ok=false;
        String input;
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
                    if (nbContact==20){
                        System.out.println("Vous avez atteint le nombre maximum de contact");
                    }
                    else {
                        tabContact[nbContact] = new Conctact();
                        nbContact++;
                        Adresse monAddresse = new Adresse();
                        Adresse adresseJob = new Adresse();
                        Occupation monOccupation =new Occupation();
                        Entreprise monEntreprise =new Entreprise();
                        tabContact[nbContact-1].setNbNum(0);

                        System.out.println("---------------------------------");
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
                        input=sc.nextLine().trim();
                        input=sc.nextLine().trim();
                        if (input.equals("")){
                            monAddresse.setAppart("");
                        }
                        else {
                            monAddresse.setAppart(sc.next());
                        }

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
                        System.out.println("    Adresse :");
                        System.out.println("      Numéro de porte :");
                        adresseJob.setNumPorte(sc.next());
                        System.out.println("      Rue :");
                        adresseJob.setRue(sc.next());
                        System.out.println("      Appartement :");
                        input=sc.nextLine().trim();
                        input=sc.nextLine().trim();
                        if (input.equals("")){
                            adresseJob.setAppart("");
                        }
                        else {
                            adresseJob.setAppart(sc.next());
                        }

                        System.out.println("      Ville :");
                        adresseJob.setVille(sc.next());
                        System.out.println("      Province :");
                        adresseJob.setProvince(sc.next());
                        System.out.println("      Pays :");
                        adresseJob.setPays(sc.next());

                        monEntreprise.setAdresseJob(adresseJob);
                        monOccupation.setJob(monEntreprise);

                        while (rep=='o'){
                            if (tabContact[nbContact-1].getNbNum()==10){
                                System.out.println("Vous avez atteint le nombre maximum de numéro");
                                rep = 'n';
                            }
                            else {
                                System.out.println();
                                System.out.println("Entrer un numéro de téléphone? (o/n)");
                                rep= sc.next().toLowerCase().charAt(0);
                                if (rep=='o'){
                                    Téléphone monTelephone=new Téléphone();
                                    System.out.println("À quoi correspond le numéro de téléphone? (cellulaire, maison, travail, ...)");
                                    monTelephone.setType(sc.next());
                                    System.out.println("Quel est le numéro? ");
                                    monTelephone.setNum(sc.next());
                                    tabContact[nbContact-1].getTabTel()[tabContact[nbContact-1].getNbNum()]=monTelephone;
                                    tabContact[nbContact-1].setNbNum(tabContact[nbContact-1].getNbNum()+1);
                                }
                                else if (rep!='n'){
                                    System.out.println("Entrez «o» ou «n»");
                                    rep='o';
                                }
                            }

                        }
                        rep='o';
                        System.out.println("Votre contact a été rentré avec succès!");
                        System.out.println("---------------------------------");

                        tabContact[nbContact-1].setAdd(monAddresse);
                        tabContact[nbContact-1].setOcc(monOccupation);
                    }


                    break;
                case 2:
                    while (!ok){
                        System.out.println("Quel est le numéro du contact que vous voulez modifier?");
                        choixModif=sc.nextInt();
                        if (choixModif<1 || choixModif>nbContact){
                            System.out.println("Entrez une réponse valide SVP");
                        }
                        else {
                            ok=true;
                            System.out.println("Veuillez entrer les informations suivantes (laisser vide si correct) :");
                            System.out.println("---------------------------------");
                            System.out.println("Contact #"+(choixModif));
                            choixModif-=1;
                            System.out.println("Prénom : ("+tabContact[choixModif].getNom()+")");
                            input=sc.nextLine().trim();
                            input=sc.nextLine().trim();
                            if(!input.equals("")){
                                tabContact[choixModif].setNom(input);
                            }
                            System.out.println("Nom de famille : ("+tabContact[choixModif].getNomFamille()+")");
                            input=sc.nextLine().trim();
                            if(!input.equals("")){
                                tabContact[choixModif].setNomFamille(input);
                            }
                            System.out.println("Adresse : ");
                            System.out.println("  Numéro de porte : ("+tabContact[choixModif].getAdd().getNumPorte()+")");
                            input=sc.nextLine().trim();
                            if(!input.equals("")){
                                tabContact[choixModif].getAdd().setNumPorte(input);
                            }
                            System.out.println("  Rue : ("+tabContact[choixModif].getAdd().getRue()+")");
                            input=sc.nextLine().trim();
                            if(!input.equals("")){
                                tabContact[choixModif].getAdd().setRue(input);
                            }
                            System.out.println("  Appartement : ("+tabContact[choixModif].getAdd().getAppart()+")");
                            input=sc.nextLine().trim();
                            if(!input.equals("")){
                                tabContact[choixModif].getAdd().setAppart(input);
                            }
                            System.out.println("  Ville : ("+tabContact[choixModif].getAdd().getVille()+")");
                            input=sc.nextLine().trim();
                            if(!input.equals("")){
                                tabContact[choixModif].getAdd().setVille(input);
                            }
                            System.out.println("  Province : ("+tabContact[choixModif].getAdd().getProvince()+")");
                            input=sc.nextLine().trim();
                            if(!input.equals("")){
                                tabContact[choixModif].getAdd().setProvince(input);
                            }
                            System.out.println("  Pays : ("+tabContact[choixModif].getAdd().getPays()+")");
                            input=sc.nextLine().trim();
                            if(!input.equals("")){
                                tabContact[choixModif].getAdd().setPays(input);
                            }
                            System.out.println("Occupation : ");
                            System.out.println("  Poste : ("+tabContact[choixModif].getOcc().getPoste()+")");
                            input=sc.nextLine().trim();
                            if(!input.equals("")){
                                tabContact[choixModif].getOcc().setPoste(input);
                            }
                            System.out.println("  Entrprise : ");
                            System.out.println("    Nom : ("+tabContact[choixModif].getOcc().getJob().getNomJob()+")");
                            input=sc.nextLine().trim();
                            if(!input.equals("")){
                                tabContact[choixModif].getOcc().getJob().setNomJob(input);
                            }
                            System.out.println("    Adresse : ");
                            System.out.println("      Numéro de porte : ("+tabContact[choixModif].getOcc().getJob().getAdresseJob().getNumPorte()+")");
                            input=sc.nextLine().trim();
                            if(!input.equals("")){
                                tabContact[choixModif].getOcc().getJob().getAdresseJob().setNumPorte(input);
                            }
                            System.out.println("      Rue : ("+tabContact[choixModif].getOcc().getJob().getAdresseJob().getRue()+")");
                            input=sc.nextLine().trim();
                            if(!input.equals("")){
                                tabContact[choixModif].getOcc().getJob().getAdresseJob().setRue(input);
                            }
                            System.out.println("      Appartement : ("+tabContact[choixModif].getOcc().getJob().getAdresseJob().getAppart()+")");
                            input=sc.nextLine().trim();
                            if(!input.equals("")){
                                tabContact[choixModif].getOcc().getJob().getAdresseJob().setAppart(input);
                            }
                            System.out.println("      Ville : ("+tabContact[choixModif].getOcc().getJob().getAdresseJob().getVille()+")");
                            input=sc.nextLine().trim();
                            if(!input.equals("")){
                                tabContact[choixModif].getOcc().getJob().getAdresseJob().setVille(input);
                            }
                            System.out.println("      Province : ("+tabContact[choixModif].getOcc().getJob().getAdresseJob().getProvince()+")");
                            input=sc.nextLine().trim();
                            if(!input.equals("")){
                                tabContact[choixModif].getOcc().getJob().getAdresseJob().setProvince(input);
                            }
                            System.out.println("      Pays : ("+tabContact[choixModif].getOcc().getJob().getAdresseJob().getPays()+")");
                            input=sc.nextLine().trim();
                            if(!input.equals("")){
                                tabContact[choixModif].getOcc().getJob().getAdresseJob().setPays(input);
                            }
                            System.out.println("Liste de numéros :");
                            while (j<tabContact[choixModif].getNbNum()){
                                System.out.println("  Téléphone #"+(j+1)+" :");
                                System.out.println("    Information : ("+tabContact[choixModif].getTabTel()[j].getType()+")");
                                input=sc.nextLine().trim();
                                if(!input.equals("")){
                                    tabContact[choixModif].getTabTel()[j].setType(input);
                                }
                                System.out.println("    Numéro : ("+tabContact[choixModif].getTabTel()[j].getNum()+")");
                                input=sc.nextLine().trim();
                                if(!input.equals("")){
                                    tabContact[choixModif].getTabTel()[j].setNum(input);
                                }

                                j++;
                            }
                            j=0;

                            while (rep=='o'){
                                if (tabContact[nbContact-1].getNbNum()==10){
                                    System.out.println("Vous avez atteint le nombre maximum de numéro");
                                    rep = 'n';
                                }
                                else {
                                    System.out.println();
                                    System.out.println("Entrer un numéro de téléphone? (o/n)");
                                    rep= sc.next().toLowerCase().charAt(0);
                                    if (rep=='o'){
                                        Téléphone monTelephone=new Téléphone();
                                        System.out.println("À quoi correspond le numéro de téléphone? (cellulaire, maison, travail, ...)");
                                        monTelephone.setType(sc.next());
                                        System.out.println("Quel est le numéro? ");
                                        monTelephone.setNum(sc.next());
                                        tabContact[choixModif].getTabTel()[tabContact[choixModif].getNbNum()]=monTelephone;
                                        tabContact[choixModif].setNbNum(tabContact[choixModif].getNbNum()+1);
                                    }
                                    else if (rep!='n'){
                                        System.out.println("Entrez «o» ou «n»");
                                        rep='o';
                                    }
                                }

                            }
                            rep='o';

                            System.out.println("---------------------------------");


                        }
                    }
                    ok=false;
                    break;
                case 3:

                    while (i<nbContact){
                        System.out.println("---------------------------------");
                        System.out.println("Contact #"+(i+1));
                        System.out.println("Prénom : "+tabContact[i].getNom());
                        System.out.println("Nom de famille : "+tabContact[i].getNomFamille());
                        System.out.println("Adresse : ");
                        System.out.println("  Numéro de porte : "+tabContact[i].getAdd().getNumPorte());
                        System.out.println("  Rue : "+tabContact[i].getAdd().getRue());
                        System.out.println("  Appartement : "+tabContact[i].getAdd().getAppart());
                        System.out.println("  Ville : "+tabContact[i].getAdd().getVille());
                        System.out.println("  Province : "+tabContact[i].getAdd().getProvince());
                        System.out.println("  Pays : "+tabContact[i].getAdd().getPays());
                        System.out.println("Occupation : ");
                        System.out.println("  Poste : "+tabContact[i].getOcc().getPoste());
                        System.out.println("  Entrprise : ");
                        System.out.println("    Nom : "+tabContact[i].getOcc().getJob().getNomJob());
                        System.out.println("    Adresse : ");
                        System.out.println("      Numéro de porte : "+tabContact[i].getOcc().getJob().getAdresseJob().getNumPorte());
                        System.out.println("      Rue : "+tabContact[i].getOcc().getJob().getAdresseJob().getRue());
                        System.out.println("      Appartement : "+tabContact[i].getOcc().getJob().getAdresseJob().getAppart());
                        System.out.println("      Ville : "+tabContact[i].getOcc().getJob().getAdresseJob().getVille());
                        System.out.println("      Province : "+tabContact[i].getOcc().getJob().getAdresseJob().getProvince());
                        System.out.println("      Pays : "+tabContact[i].getOcc().getJob().getAdresseJob().getPays());
                        System.out.println("Liste de numéros :");
                        while (j<tabContact[i].getNbNum()){
                            System.out.println("  Téléphone #"+(j+1)+" :");
                            System.out.println("    Information : "+tabContact[i].getTabTel()[j].getType());
                            System.out.println("    Numéro : "+tabContact[i].getTabTel()[j].getNum());

                            j++;
                        }
                        j=0;
                        i++;
                    }
                    i=0;
                    System.out.println("---------------------------------");
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
