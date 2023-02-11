import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-routingparam',
  templateUrl: './routingparam.component.html',
  styleUrls: ['./routingparam.component.css']
})
export class RoutingparamComponent implements OnInit {
  id: number;
  name: string;
  url: string;

  constructor(private route: ActivatedRoute, private router: Router) {
  }

  ngOnInit() {
    this.route.queryParams.subscribe(params => {
      this.url = this.router.url;
      this.id = this.route.snapshot.params.id;
      this.name = this.route.snapshot.params.name;
      console.log(`this.url:`, this.url);
      console.log(`this.id:`, this.id);
      console.log(`this.name:`, this.name);
    });
  }

}
