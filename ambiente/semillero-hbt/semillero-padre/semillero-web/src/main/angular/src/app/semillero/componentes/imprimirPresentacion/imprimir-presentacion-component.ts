import { Component, OnInit } from '@angular/core';
/**
 * @description componente que imprime mi nombre y ciudad
 * @author olivia florez garcia <oliflorez21@gmail.com>
 */

@Component({
    selector: 'imprimir-presentacion',
    templateUrl: './imprimir-presentacion-component.html',
  //  styleUrls: ['./gestionar-comic.css']
})
export class ImprimirPresentacionComponet implements OnInit {
/**
 * @description creo la variable que contendra el nombre y la ciudad concatenada
 *  @author olivia florez garcia <oliflorez21@gmail.com>
 */
    public datospresentacion: string; //opcion1 uniendo nombre y ciudad en un solo texto
    public nombres: string; //opcion2 declarando variables separadas y concatenarlas en el html
    public ciudad: string; 

/**
 * @description este es el constructor del componente imprimirpresentacion
 * @author olivia florez garcia <oliflorez21@gmail.com>
 */
    constructor(){

}
ngOnInit(): void{
    // opcion1: asigno nombre y ciudad a la variable de tipo string
        this.datospresentacion = "Olivia Angelica Florez Garcia - Monteria";

    // opcion2: asigno nombre y ciudad por separado en dos variable de tipo string  
    this.nombres="Olivia Angelica Florez Garcia";
    this.ciudad="Monteria";  
    
     console.log("Ingreso al componente imprimirpresentacioncomponent")
}

}

