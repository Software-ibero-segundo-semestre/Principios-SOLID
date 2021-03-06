class Coche():

	def __init__(self): 

		self.__largochasis=250
		self.__anchochasis=120
		self.__ruedas=4  
		self.__enmarcha=False

	def arrancar(self,arrancamos):
		self.__enmarcha=arrancamos
		if(self.__enmarcha):
			chequeo=self.__chequeo_interno()

		if(self.__enmarcha and chequeo):
			return ("El coche está en marcha.")

		elif(self.__enmarcha and chequeo==False):
			return("Algo salió mal, no podemos arrancar ")

		else:

    		 return ("El coche está parado")


	def estado(self):
		print("El coche tiene ",self.__ruedas," ruedas.\n El coche tiene un ancho de ",self.__anchochasis,"Cms.","\n El coche tiene un largo de ",self.__largochasis," Cms.")

	def __chequeo_interno(self):
		print("Realizando chequeo interno")

		self.gasolina="ok"
		self.aceite="ok"
		self.puertas="cerradas"

		if(self.gasolina=="ok" and self.aceite=="ok" and self.puertas=="cerradas"):

			return True
		else:

			return False


miCoche=Coche()

print(miCoche.arrancar(True))

miCoche.estado()

