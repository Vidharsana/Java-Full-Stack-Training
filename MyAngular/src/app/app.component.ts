import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  name : string;
  age : number;
  email : string;
  txtColor : string;
  imgPath : string;

  constructor(){
    this.name = "Vidhu";
    this.age = 20;
    this.email = "vidhu@gmail.com";
    this.txtColor = "blue";
    this.imgPath = "./assets/logo1.png";
  }

  getAddition(a : number, b : number){
    let sum = a + b;
    return sum;
  }

  changeName(){
    this.name = "Ani";
  }
  changeAge(){
    this.age = 25;
  }
  changeEmail(){
    this.email = "ani@gmail.com";
  }
  changeImage(){
      this.imgPath = "./assets/logo2.png";
  }
}
