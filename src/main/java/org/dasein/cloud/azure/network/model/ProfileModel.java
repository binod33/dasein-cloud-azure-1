package org.dasein.cloud.azure.network.model;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name="Profile", namespace = "http://schemas.microsoft.com/windowsazure")
@XmlAccessorType(XmlAccessType.FIELD)
public class ProfileModel
{
    @XmlElement(name="DomainName", namespace = "http://schemas.microsoft.com/windowsazure")
    private String domainName;
    @XmlElement(name="Name", namespace = "http://schemas.microsoft.com/windowsazure")
    private String name;
    @XmlElement(name="Status", namespace = "http://schemas.microsoft.com/windowsazure")
    private String status;
    @XmlElement(name="StatusDetails", namespace = "http://schemas.microsoft.com/windowsazure")
    private ProfileStatusDetailsResponseModel statusDetails;
    @XmlElementWrapper(name = "Definitions", namespace = "http://schemas.microsoft.com/windowsazure")
    @XmlElement(name="Definition", namespace = "http://schemas.microsoft.com/windowsazure")
    private List<ProfileDefinitionResponseModel> profileDefinitionResponseModels;

    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ProfileStatusDetailsResponseModel getStatusDetails() {
        return statusDetails;
    }

    public void setStatusDetails(ProfileStatusDetailsResponseModel statusDetails) {
        this.statusDetails = statusDetails;
    }

    public List<ProfileDefinitionResponseModel> getProfileDefinitionResponseModels() {
        return profileDefinitionResponseModels;
    }

    public void setProfileDefinitionResponseModels(List<ProfileDefinitionResponseModel> profileDefinitionResponseModels) {
        this.profileDefinitionResponseModels = profileDefinitionResponseModels;
    }


    @XmlRootElement(name="Definition", namespace = "http://schemas.microsoft.com/windowsazure")
    @XmlAccessorType(XmlAccessType.FIELD)
    public static class ProfileDefinitionResponseModel {
        @XmlElement(name="Status", namespace = "http://schemas.microsoft.com/windowsazure")
        private String status;
        @XmlElement(name="Version", namespace = "http://schemas.microsoft.com/windowsazure")
        private String version;

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }
    }

    @XmlRootElement(name="StatusDetails", namespace = "http://schemas.microsoft.com/windowsazure")
    @XmlAccessorType(XmlAccessType.FIELD)
    public static class ProfileStatusDetailsResponseModel {
        @XmlElement(name="EnabledVersion", namespace = "http://schemas.microsoft.com/windowsazure")
        private String enabledVersion;

        public String getEnabledVersion() {
            return enabledVersion;
        }

        public void setEnabledVersion(String enabledVersion) {
            this.enabledVersion = enabledVersion;
        }
    }
}

