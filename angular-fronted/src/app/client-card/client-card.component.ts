import { Component, OnInit } from '@angular/core';
import { firstValueFrom, lastValueFrom } from 'rxjs';
import { HttpClient, HttpParams } from '@angular/common/http';

@Component({
  selector: 'app-client-card',
  templateUrl: './client-card.component.html',
  styleUrls: ['./client-card.component.scss']
})
export class ClientCardComponent implements OnInit {
  clients: any;
  urlClients: string = `http://localhost:9000/clients`;
  constructor(private http: HttpClient) { 
    this.getClients(this.urlClients);
  }

  ngOnInit(): void {
  }

  async getClients(url: string){
    try{
      let data: any = await firstValueFrom(this.http.get(url));
      let listClients = [];
      for(let key in data){
        let obj = data[key];
        listClients.push(obj);
      }

      this.clients = listClients;
    }catch(e){
      console.log(e);
    }
  }
}
