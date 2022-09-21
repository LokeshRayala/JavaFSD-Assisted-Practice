import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-directives',
  templateUrl: './directive.component.html',
  styleUrls: ['./directive.component.css']
})
export class DirectivesComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  products=[{"name":"Lokesh Rayala","email":"Loki1@gmail.com"},
  {"name":"Alex","email":"alex@gmail.com"},
  {"name":"John sephard","email":"jhonS@gmail.com"},
  {"name":"Sujal","email":"sujal@gmail.com"},
  {"name":"Kiran","email":"KiranP@gmail.com"},
  {"name":"Mohan","email":"mohan@gmail.com"},
  {"name":"James Reece","email":"James2@gmail.com"},
  {"name":"Lauren","email":"Laura@gmail.com"},
]

flag=false;

show(){
  this.flag=!this.flag;
}

public day= new Date().getDay();
}