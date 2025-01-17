import { Injectable } from '@angular/core';
import { Employee } from './model/Employee';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
  url:string;
  employeeArr:Employee[];
  employee : Employee;
  constructor(private http:HttpClient) {
this.url="http://localhost:3004/employee";
this.employeeArr=[];
this.employee=new Employee();
   }

  insertEmployee (employee : Employee)
  {
    // this.http.post("http://localhost:3004/", employee).subscribe();
    this.http.post<Employee>(this.url, employee).subscribe();
    return "Employee Details Added";
  }
}
