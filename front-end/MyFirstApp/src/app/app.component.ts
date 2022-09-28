import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent
{
  private title: string = 'Testeee';
  private data: PADOInterface[] = [
    {
      id: 1,
      title: 'Teste PADO',
      imageUrl: 'assets/pado.png'
    },
    {
      id: 2,
      title: 'Teste PADO 2',
      imageUrl: 'assets/pado.png'
    },
    {
      id: 3,
      title: 'Teste PADO 3',
      imageUrl: 'assets/pado.png'
    }
  ]

  constructor(){}

  //GETTERS & setters
  protected getTitle()
  {
    return this.title;
  }

  protected setTitle(event: any)
  {
    this.title = event.target.value;
  }

  protected getData(): PADOInterface[]
  {
    return this.data;
  }
}

//interfaces//
interface PADOInterface {
  id: number;
  title: string;
  imageUrl: string;
}
