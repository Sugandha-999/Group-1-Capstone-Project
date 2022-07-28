import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-chatbox',
  templateUrl: './chatbox.component.html',
  styleUrls: ['./chatbox.component.scss']
})
export class ChatboxComponent implements OnInit {
  mymessage:string[] = []; 
  m:any;
  constructor() { }

  ngOnInit(): void {
  }
  sendmessage(){
    console.log(this.m);
   this.mymessage.push(this.m)
   this.m=null;
  }
}
