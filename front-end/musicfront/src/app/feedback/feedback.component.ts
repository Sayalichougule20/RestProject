import { Component } from '@angular/core';
import { Feedback } from '../models/feedback';
import { FeedbackService } from '../services/feedback.service';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-feedback',
  imports: [FormsModule,CommonModule],
  templateUrl: './feedback.component.html',
  styleUrl: './feedback.component.css'
})
export class FeedbackComponent {
  fd:Feedback = new Feedback();
 
  errorMessage: string = '';

  constructor(private fdServ: FeedbackService) {}

  submitdata()
  {
    this.fd.emailid=localStorage.getItem("emailid")
    this.fdServ.savefeedback(this.fd).subscribe(data=>{
      if(data!=null)
      {
        alert("Thank you for valuable feedback")
      }
    })
  }
}