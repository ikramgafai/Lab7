package ma.ws.jaxrs.entities;

import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlElement;
import java.util.List;

@XmlRootElement(name = "comptes")
public class CompteListWrapper {

    @XmlElement(name = "compte")
    private List<Compte> comptes;

    public CompteListWrapper() {}

    public CompteListWrapper(List<Compte> comptes) {
        this.comptes = comptes;
    }

    public List<Compte> getComptes() {
        return comptes;
    }

    public void setComptes(List<Compte> comptes) {
        this.comptes = comptes;
    }
}

