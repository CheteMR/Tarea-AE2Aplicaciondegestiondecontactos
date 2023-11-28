# Tarea AE2 Aplicación de gestión de contactos
En este repositorio podremos encontrar una aplicación de gestión de contactos. Con las caracteristicas principales de un CRUD, añadir, modificar y eliminar

La aplicación de gestión telefónica tiene como características más importantes un 
JTable para hacer la gestión de los contactos. 

Esta gestión se va a realizar mediante los tres botones de abajo de la app. 
Estos tres botones tienen la función de añadir un contacto, eliminar y editarlo. 

[![1.png](https://i.postimg.cc/pX6hF03j/1.png)](https://postimg.cc/bs1wXRyY)

Cuando hacemos click en el botón “Añadir Contacto”, nos sale la ventana emergente 
para dicho fin. Escribimos el nombre y el número de télefono para añadirlo al JTable en cuando
le demos click al botón de “OK” 

[![2.png](https://i.postimg.cc/PxTPj0vg/2.png)](https://postimg.cc/67b9Vj0c)

[![3.png](https://i.postimg.cc/gjBJ3Jtp/3.png)](https://postimg.cc/N2mBcgwC)

Seleccionando la fila y dandole click al botón editar, nos aparece la ventana emergente de 
“Editar Contacto” se va a proceder a cambiar el nombre y el número de teléfono. 

[![4.png](https://i.postimg.cc/XJLX7xwp/4.png)](https://postimg.cc/627BMrbX)

[![5.png](https://i.postimg.cc/43zmjXyv/5.png)](https://postimg.cc/KK8GMSn4)

Como se ha visto en el pantallazo anterior se procede a cambiar a Ignacio por Rodrigo.
Ha quedado modificado el contacto de Ignacio  

[![6.png](https://i.postimg.cc/9Xxz68mk/6.png)](https://postimg.cc/BtKqDC15)

Ahora vamos a añadir varios contactos para eliminar a Almudena que es la que se va a seleccionar.
Además con este método, la celda no se puede editar. Y cuando seleccionemos a Almudena no
nos saldrá la celda editable.
public boolean isCellEditable (int row, int column) {
			return false;
		}

[![7.png](https://i.postimg.cc/dtp31hTm/7.png)](https://postimg.cc/ppQRcXCp)

Almudena ha sido eliminada de la agenda de contactos

[![8.png](https://i.postimg.cc/pXpyRfyL/8.png)](https://postimg.cc/QHZjqWp2)

Si se quiere añadir un número que tenga más ,o menos de 9 dígitos no nos va a dejar. 
Por otro lado, si se quiere añadir una letra en el número de teléfono tampoco 
nos va a dejar. 

[![9.png](https://i.postimg.cc/90f04Tp1/9.png)](https://postimg.cc/WFQTCdxJ)

En el caso de poner una letra, tampoco nos dejaría

[![10.png](https://i.postimg.cc/hGqGLNsX/10.png)](https://postimg.cc/FYDmmW2v)

Como último detalle se podrá añadir y editar desde la barra de “Menú” el cual 
cuenta con dos JMenuItem “Añadir” y “Editar”

[![11.png](https://i.postimg.cc/NjXMrQ6h/11.png)](https://postimg.cc/K1ZF6SpQ)

