package com.driver;

public class Email {

    private String emailId;
    private String password;
    private boolean isCap;
    private boolean issmall;
    private boolean isdigit;
    private boolean isspecial;

    public Email(String emailId){
        this.emailId = emailId;
        this.password = "Accio@123";
        this.isCap = false;
        this.issmall = false;
        this.isdigit = false;
        this.isspecial = false;

    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }

    public void changePassword(String oldPassword, String newPassword){
        //Change password only if the oldPassword is equal to current password and the new password meets all of the following:
        // 1. It contains at least 8 characters
        // 2. It contains at least one uppercase letter
        // 3. It contains at least one lowercase letter
        // 4. It contains at least one digit
        // 5. It contains at least one special character. Any character apart from alphabets and digits is a special character
        if(oldPassword.equals(this.password)){
            if(newPassword.length()>=8) {
                for (int i = 0; i < newPassword.length(); i++) {
                    char c = newPassword.charAt(i);
                    if (c >= 90 && c <= 122){
                        issmall = true;
                    }
                    if(c>=65 && c <=97) isCap = true;
                    if(Character.isDigit(c)) isdigit = true;
                    else isspecial = true;
                }
                if(isCap && issmall && isdigit && isspecial) this.password = newPassword;
            }

        }
    }
}
