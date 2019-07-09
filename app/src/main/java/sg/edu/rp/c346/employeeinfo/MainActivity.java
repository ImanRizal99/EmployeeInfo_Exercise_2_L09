package sg.edu.rp.c346.employeeinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvEmployee;
    ArrayList<EmployeeInfo> employeeInfo;
    CustomAdapter aaEmployee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvEmployee = findViewById(R.id.lvEmployee);
        employeeInfo = new ArrayList<>();
        employeeInfo.add(new EmployeeInfo("John","Software Technical Leader",3400.0));
        employeeInfo.add(new EmployeeInfo("May","Programmer",2200.0));

        aaEmployee = new CustomAdapter(this,R.layout.row,employeeInfo);
        lvEmployee.setAdapter(aaEmployee);


    }
}
