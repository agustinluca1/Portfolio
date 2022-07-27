export class Proyectos {
    id? : number;
    nombrePr : string;
    descripcionPr : string;
    fechaPr : Date;

    constructor(nombrePr: string, descripcionPr: string, fechaPr: Date){
        this.nombrePr = nombrePr;
        this.descripcionPr = descripcionPr;
        this.fechaPr = fechaPr;
    }
}
