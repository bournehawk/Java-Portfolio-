/*  Name:   Sarah Hulcy
    Class:  MSITM 6340
    Date:   
 */

import java.util.Scanner;

public class AccountHolder
{
    private String _firstName;
    private String _lastName;
    private String _address;
    private String _phoneNumber;
    private String _ssn;
    private String _emailAddress;

    public AccountHolder( String fName, String lName, String address, String phoneNumber, String ssn, String emailAddress)
    {
        _firstName = fName;
        _lastName = lName;
        _address = address;
        _phoneNumber = phoneNumber;
        _ssn = ssn;
        _emailAddress = emailAddress;
    }

    public String getFullName ()
    {
        return _firstName + " " +  _lastName;
    }

    public  String getAddress ()
    {
        return _address;
    }

    public void setAddress (String newaddress)
    {
        _address = newaddress;
    }

    public String getPhoneNumber  ()
    {
        return _phoneNumber;
    }

    public void setPhoneNumber (String newPhoneNumber)
    {
        _phoneNumber = newPhoneNumber;
    }

    public String getSSN ()
    {
        return _ssn;
    }

    public String getEmail ()
    {
        return _emailAddress;
    }

    public void setEmail (String newEmail)
    {
        _emailAddress = newEmail;
    }
}
