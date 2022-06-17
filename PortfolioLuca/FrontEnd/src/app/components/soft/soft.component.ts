import { Component, OnInit } from '@angular/core';
import { Color, ScaleType } from '@swimlane/ngx-charts';


@Component({
  selector: 'app-soft',
  templateUrl: './soft.component.html',
  styleUrls: ['./soft.component.css']
})
export class SoftComponent implements OnInit {

  view: [number, number] = [900, 500];
  legend: boolean = true;
  showLegend: boolean = true;
  showLabels: boolean = true;
  numeroTotal: number = 100;
  
  
  colorScheme : Color = {
    name: 'myScheme',
    selectable: true,
    group: ScaleType.Ordinal,
    domain: ['#00358e', '#00358e', '#00358e'],
  };

  single = [
    {
      "name": "Trabajo en equipo",
      "value": 90
    },
    {
      "name": "Manejo del tiempo",
      "value": 80
    },
    {
      "name": "Autodesarrollo",
      "value": 95
    },
    {
      "name": "Resolución de problemas",
      "value": 90
    },
    {
      "name": "Autoconocimiento",
      "value": 85
    },
    {
      "name": "Atención al detalle",
      "value": 85
    }
  ];
  

  constructor() {
    //Object.assign(this, { single });
  }

  onSelect(event: any) {
    console.log(event);
  }


  ngOnInit(): void {
  }

}
