package models;

public class Contact {
    String Salutation;
    String FirstName;
    String LastName;
    String Phone;
    String Mobile;
    String AccountName;
    String Title;
    String Email;
    String MailingStreet;
    String MailingCity;
    String MailingZip_PostalCode;
    String MailingState_Province;
    String MailingCountry;
    String OtherStreet;
    String OtherCity;
    String OtherZip_PostalCode;
    String OtherState_Province;
    String OtherCountry;
    String Fax;
    String HomePhone;
    String OtherPhone;
    String AsstPhone;
    String Assistant;
    String Department;
    String LeadSource;
    String Description;

    public Contact(String salutation, String firstName, String lastName, String phone, String mobile, String accountName, String title, String email, String mailingStreet, String mailingCity, String mailingZip_PostalCode, String mailingState_Province, String mailingCountry, String otherStreet, String otherCity, String otherZip_PostalCode, String otherState_Province, String otherCountry, String fax, String homePhone, String otherPhone, String asstPhone, String assistant, String department, String leadSource, String description, String allFieldsAreFilled) {
        Salutation = salutation;
        FirstName = firstName;
        LastName = lastName;
        Phone = phone;
        Mobile = mobile;
        AccountName = accountName;
        Title = title;
        Email = email;
        MailingStreet = mailingStreet;
        MailingCity = mailingCity;
        MailingZip_PostalCode = mailingZip_PostalCode;
        MailingState_Province = mailingState_Province;
        MailingCountry = mailingCountry;
        OtherStreet = otherStreet;
        OtherCity = otherCity;
        OtherZip_PostalCode = otherZip_PostalCode;
        OtherState_Province = otherState_Province;
        OtherCountry = otherCountry;
        Fax = fax;
        HomePhone = homePhone;
        OtherPhone = otherPhone;
        AsstPhone = asstPhone;
        Assistant = assistant;
        Department = department;
        LeadSource = leadSource;
        Description = description;
    }

    public String getSalutation() {
        return Salutation;
    }

    public void setSalutation(String salutation) {
        Salutation = salutation;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String mobile) {
        Mobile = mobile;
    }

    public String getAccountName() {
        return AccountName;
    }

    public void setAccountName(String accountName) {
        AccountName = accountName;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getMailingStreet() {
        return MailingStreet;
    }

    public void setMailingStreet(String mailingStreet) {
        MailingStreet = mailingStreet;
    }

    public String getMailingCity() {
        return MailingCity;
    }

    public void setMailingCity(String mailingCity) {
        MailingCity = mailingCity;
    }

    public String getMailingZip_PostalCode() {
        return MailingZip_PostalCode;
    }

    public void setMailingZip_PostalCode(String mailingZip_PostalCode) {
        MailingZip_PostalCode = mailingZip_PostalCode;
    }

    public String getMailingState_Province() {
        return MailingState_Province;
    }

    public void setMailingState_Province(String mailingState_Province) {
        MailingState_Province = mailingState_Province;
    }

    public String getMailingCountry() {
        return MailingCountry;
    }

    public void setMailingCountry(String mailingCountry) {
        MailingCountry = mailingCountry;
    }

    public String getOtherStreet() {
        return OtherStreet;
    }

    public void setOtherStreet(String otherStreet) {
        OtherStreet = otherStreet;
    }

    public String getOtherCity() {
        return OtherCity;
    }

    public void setOtherCity(String otherCity) {
        OtherCity = otherCity;
    }

    public String getOtherZip_PostalCode() {
        return OtherZip_PostalCode;
    }

    public void setOtherZip_PostalCode(String otherZip_PostalCode) {
        OtherZip_PostalCode = otherZip_PostalCode;
    }

    public String getOtherState_Province() {
        return OtherState_Province;
    }

    public void setOtherState_Province(String otherState_Province) {
        OtherState_Province = otherState_Province;
    }

    public String getOtherCountry() {
        return OtherCountry;
    }

    public void setOtherCountry(String otherCountry) {
        OtherCountry = otherCountry;
    }

    public String getFax() {
        return Fax;
    }

    public void setFax(String fax) {
        Fax = fax;
    }

    public String getHomePhone() {
        return HomePhone;
    }

    public void setHomePhone(String homePhone) {
        HomePhone = homePhone;
    }

    public String getOtherPhone() {
        return OtherPhone;
    }

    public void setOtherPhone(String otherPhone) {
        OtherPhone = otherPhone;
    }

    public String getAsstPhone() {
        return AsstPhone;
    }

    public void setAsstPhone(String asstPhone) {
        AsstPhone = asstPhone;
    }

    public String getAssistant() {
        return Assistant;
    }

    public void setAssistant(String assistant) {
        Assistant = assistant;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public String getLeadSource() {
        return LeadSource;
    }

    public void setLeadSource(String leadSource) {
        LeadSource = leadSource;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
