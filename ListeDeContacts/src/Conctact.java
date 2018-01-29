/**
 * Created by ibada1731710 on 2018-01-22.
 */
public class Conctact {

    private String nom;
    private String nomFamille;
    private Adresse add;
    private Téléphone[] tabTel= new Téléphone[10];
    private Occupation occ;
    private int nbNum;



    public String getNom() {
        return nom;
    }

    public String getNomFamille() {
        return nomFamille;
    }

    public Adresse getAdd() {
        return add;
    }

    public Occupation getOcc() {
        return occ;
    }

    public Téléphone[] getTabTel() {return tabTel;}

    public int getNbNum() { return nbNum; }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNomFamille(String nomFamille) {
        this.nomFamille = nomFamille;
    }

    public void setAdd(Adresse add) {
        this.add = add;
    }

    public void setTabTel(Téléphone[] tabTel) {this.tabTel = tabTel;}

    public void setOcc(Occupation occ) {
        this.occ = occ;
    }

    public void setNbNum(int nbNum) { this.nbNum = nbNum; }
}
