package canady_connectfour;

public class Node {

    Node ul, u, ur;
    Node l, r;
    Node dl, d, dr;
    int v;
    
    Node() {
       v = 0; 
    }

    public void setUl(Node ul) {
        this.ul = ul;
    }

    public void setU(Node u) {
        this.u = u;
    }

    public void setUr(Node ur) {
        this.ur = ur;
    }

    public void setL(Node l) {
        this.l = l;
    }

    public void setR(Node r) {
        this.r = r;
    }

    public void setDl(Node dl) {
        this.dl = dl;
    }

    public void setD(Node d) {
        this.d = d;
    }

    public void setDr(Node dr) {
        this.dr = dr;
    }

    public Node getUl() {
        return ul;
    }

    public Node getU() {
        return u;
    }

    public Node getUr() {
        return ur;
    }

    public Node getL() {
        return l;
    }

    public Node getR() {
        return r;
    }

    public Node getDl() {
        return dl;
    }

    public Node getD() {
        return d;
    }

    public Node getDr() {
        return dr;
    }

}
