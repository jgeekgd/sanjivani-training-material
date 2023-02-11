import { Router, RouterState, RouterStateSnapshot } from '@angular/router';
import { Injectable } from '@angular/core';
import { CanActivate, ActivatedRouteSnapshot } from '@angular/router';

import { AuthService } from './auth.service';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AuthGuard implements CanActivate {

  constructor(private router: Router, private auth: AuthService) {
    // const state: RouterState = router.routerState;
    // console.log("RouterState: " + state);
    // const snapshot: RouterStateSnapshot = state.snapshot;
    // console.log("RouterStateSnapshot: " + snapshot);
    // const root: ActivatedRouteSnapshot = snapshot.root;
    // console.log("ActivatedRouteSnapshot: " + root);
    // const child = root.firstChild;
    // console.log("root.firstChild: " + child);
    // const id: Observable<string> = child.params.map(p => p.id);
    // console.log("id: " + id);
  }

  //ActivatedRouteSnapshot:
  //https://angular.io/api/router/ActivatedRouteSnapshot
  //Contains the information about a route associated with a component loaded in an outlet at a particular moment in time. 
  //ActivatedRouteSnapshot can also be used to traverse the router state tree.

  //RouterStateSnapshot:
  //It is a tree of activated route snapshots.
  //Every node in this tree knows about the "consumed" URL segments, the extracted parameters, and the resolved data

  canActivate(route: ActivatedRouteSnapshot // ,state: RouterStateSnapshot
  ): boolean {
    //How to get current route in canActive route?, use below code
    window.alert("Recevied Url Acces: " + route.url);
    //window.alert("Recevied Url Acces: " + state.url);
    if (this.auth.isLoggedIn()) {
      return true;
    }
    window.alert('You don\'t have permission to view this page');
    this.router.navigateByUrl('/');
    return false;
  }
}

// ActivatedRouteSnapshot:
// 1. Snapshot (route.snapshot.paramMap.get). Read it during init.
// Use the Snapshot if you only need the initial value of the parameter once during the component's initialization, and don't expect the URL to change while the user is still on that same component.

// ActivatedRoute:
// I.e. if on a product/2 route, and the only way they'd get to product/3 is by going back to the product search screen and then clicking a product detail (leaving the detail component, then re-opening it with a new route param)
// 2. Observable (route.paramMap.subscribe). Subscribe to it during init.
// Use the Observable if it's possible for the route to change while the user is still on the same component, and hence the Component's initialization would not be called again, but the observable would call your subscribed logic when the URL changed.
// I.e. if on a product/2 route, and you have a "next" button to go to the next id record product/3, hence the user did not leave/re-open the component but the URL did receive a new param.


// Since ActivatedRoute can be reused, ActivatedRouteSnapshot is an immutable object representing a particular version of ActivatedRoute. It exposes all the same properties as ActivatedRoute as plain values, while ActivatedRoute exposes them as observables.

/*
Suppose you have the following routing configuration:

path: /segment1/:id,
component: AComponent
Now you navigate to:

/segment1/1
You will have the param in the activatedRoute.snapshot.params.id as 1.

Now you navigate to:

/segment1/2
You will have the param in the activatedRoute.snapshot.params.id as 2.

You can see it by implementing the following:

export class AComponent {
  constructor(r: ActivatedRoute) {    
    r.url.subscribe((u) => {
      console.log(r.snapshot.params.id);
    });
*/