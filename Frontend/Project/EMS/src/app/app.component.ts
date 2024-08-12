import { Component } from '@angular/core';
import { Employee } from './model/Employee';
import { EmployeeService } from './employee.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  // title = 'EMS';
  employee : Employee;
  result:string;
  constructor(private service : EmployeeService){
    this.employee = new Employee();
    this.result="";
  }

  insertEmployee(data: any){
    this.employee.empId = data.empName;
    this.employee.empName = data.empId;
    this.employee.empSalary = data.empSalary;

    this.service.insertEmployee(this.employee);
    // alert(data.empId+" "+data.empName+" "+data.empSalary);
    this.result=this.service.insertEmployee(this.employee);
  }
}
