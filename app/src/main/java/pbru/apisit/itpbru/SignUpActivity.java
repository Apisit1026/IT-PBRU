package pbru.apisit.itpbru;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SignUpActivity extends AppCompatActivity {

    //Explicit ประกาศตัวแปร
    private EditText nameEditText, surnameEditText, userEditText, passwordEditText;
    private String nameString, surnameString, userString, passwordString;
    private static final String urlUpload = "http://swiftcodingthai.com/pbru2/add_user_master.php";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        //Bind Widget
        nameEditText = (EditText) findViewById(R.id.editText);
        surnameEditText = (EditText) findViewById(R.id.editText2);
        userEditText = (EditText) findViewById(R.id.editText3);
        passwordEditText = (EditText) findViewById(R.id.editText4);

    } //Main Method

    public void clickSignUpSign(View view) {

        nameString = nameEditText.getText().toString().trim();
        surnameString = surnameEditText.getText().toString().trim();
        userString = userEditText.getText().toString().trim();
        passwordString = surnameEditText.getText().toString().trim();

        //Check Space
        if (checkSpace()) {
            //True
            MyAlert myAlert = new MyAlert();
            myAlert.myDialog(this, "มีช่องว่าง","กรุณากรอกทุกช่องคะ");

        } else {
            //False
            uploadValueToServer();

        }

    } //ClickSign

    private void uploadValueToServer() {

    }//upload

    private boolean checkSpace() {

        boolean result = true;

        result = nameString.equals("") || surnameString.equals("") ||
                userString.equals("") || passwordEditText.equals("");

        return result;
    }


}
