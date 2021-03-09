public
class Jarra {//variables de instancia
private
int cantidad;
private
int capacidad;
public
Jarra(int capacidadInicial){
if
(capacidadInicial<=
throw
new RuntimeException("ERROR: no se pueden crear jarras “ +
"con capacidad menor o igual que cero.");
}
this.capacidad
=
}
// Aquí vendrán después los métodos creados en la siguiente fase

public void llenaDesde(Jarra j){
while((this.cantidad<this.capacidad)&&(j.cantidad>0)){
this.cantidad++;
j.cantidad--;}
}
publicString toString(){
return ("("+this.capacidad+","+this.cantidad+")");
}
public
void metodoComunitario(){
// Comentario incluido para pruebas
System.out.println
("Aqui escribimos
}
}