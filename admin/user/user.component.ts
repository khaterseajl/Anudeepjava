import { Component, OnInit } from '@angular/core';
import { FormControl } from '@angular/forms';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit{
ngOnInit(): void {
  throw new Error('Method not implemented.');
}
password=new FormControl('');
email=new FormControl('');
name=new FormControl('');

}