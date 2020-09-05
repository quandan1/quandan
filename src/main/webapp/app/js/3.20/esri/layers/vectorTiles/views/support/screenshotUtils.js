// All material copyright ESRI, All Rights Reserved, unless otherwise specified.
// See http://js.arcgis.com/3.20/esri/copyright.txt for details.
//>>built
define("esri/layers/vectorTiles/views/support/screenshotUtils",["require","exports","dojo/_base/lang"],function(E,l,u){l.adjustScreenshotSettings=function(a,c){a=u.mixin({format:"png",quality:100},a||{});var d,e;a.includePadding?(d=c.width,e=c.height):(d=c.width-c.padding.left-c.padding.right,e=c.height-c.padding.top-c.padding.bottom);var h=d/e;void 0!==a.width&&void 0===a.height?a.height=a.width/h:void 0!==a.height&&void 0===a.width&&(a.width=h*a.height);void 0!==a.height&&(a.height=Math.floor(a.height));
void 0!==a.width&&(a.width=Math.floor(a.width));a.area||a.includePadding||(a.area={x:c.padding.left,y:c.padding.top,width:d,height:e});return a};l.resampleHermite=function(a,c,d,e,h,v,w){void 0===w&&(w=!0);var m=c/h;d/=v;for(var l=Math.ceil(m/2),u=Math.ceil(d/2),g=0;g<v;g++)for(var k=0;k<h;k++){for(var n=4*(k+(w?v-g-1:g)*h),b=0,p=0,x=0,y=0,z=0,A=0,B=0,C=(g+.5)*d,q=Math.floor(g*d);q<(g+1)*d;q++)for(var r=Math.abs(C-(q+.5))/u,D=(k+.5)*m,r=r*r,t=Math.floor(k*m);t<(k+1)*m;t++){var f=Math.abs(D-(t+.5))/
l,b=Math.sqrt(r+f*f);-1<=b&&1>=b&&(b=2*b*b*b-3*b*b+1,0<b&&(f=4*(t+q*c),B+=b*a[f+3],x+=b,255>a[f+3]&&(b=b*a[f+3]/250),y+=b*a[f],z+=b*a[f+1],A+=b*a[f+2],p+=b))}e[n]=y/p;e[n+1]=z/p;e[n+2]=A/p;e[n+3]=B/x}}});