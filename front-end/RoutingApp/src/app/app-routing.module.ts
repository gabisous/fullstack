import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponetComponent } from './home-component/home-componet.component';
import { NotFoundComponent } from './not-found/not-found.component';

const routes: Routes = [
   {path: "home", component: HomeComponetComponent},
   {path: "", component: NotFoundComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
