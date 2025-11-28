# Tablero Basket


## Descripción

Tablero Basket es una aplicación sencilla e intuitiva que permite registrar los puntos de dos equipos (Local y Visitante) durante un partido de baloncesto. La app mantiene el marcador incluso al girar el dispositivo y muestra el resultado final con animaciones visuales.

## Características

- **Marcador en tiempo real**: Actualización instantánea de puntuaciones
- **Suma de puntos**: Botones para añadir 1, 2 o 3 puntos a cada equipo
- **Resta de puntos**: Opción para restar 1 punto en caso de error
- **Reinicio de marcador**: Botón para resetear ambos marcadores a 0
- **Pantalla de resultados**: Visualización del ganador con iconos dinámicos
- **Persistencia de datos**: Los marcadores se mantienen al rotar el dispositivo
- **Diseño moderno**: Interfaz limpia con colores personalizados

## Tecnologías utilizadas

- **Lenguaje**: Java
- **IDE**: Android Studio
- **Arquitectura**: MVVM (Model-View-ViewModel)
- **Componentes**:
  - Data Binding
  - LiveData
  - ViewModel
  - ConstraintLayout
  - Material Design

## Estructura del proyecto

```
app/src/main/java/com/example/tablero_basket/
├── MainActivity.java          # Pantalla principal con el marcador
├── ScoreActivity.java         # Pantalla de resultados
└── ScoreViewModel.java        # ViewModel para gestionar el estado

app/src/main/res/layout/
├── activity_main.xml          # Layout del marcador
└── activity_score.xml         # Layout de resultados
```

## Funcionalidades principales

### MainActivity
- Muestra los marcadores de ambos equipos
- Permite sumar 1, 2 o 3 puntos
- Permite restar 1 punto
- Botón de reset para reiniciar marcadores
- Navegación a la pantalla de resultados

### ScoreActivity
- Muestra el resultado final
- Determina el ganador o si hay empate
- Iconos dinámicos según el resultado:
  - Copa para el equipo local ganador
  - Medalla para el equipo visitante ganador
  - Emoji de sueño para empates
- Botón para volver al marcador

### ScoreViewModel
- Gestiona el estado de los marcadores
- Mantiene los datos durante cambios de configuración (rotación)
- Lógica de negocio para sumar/restar puntos

## Notas técnicas

### Solución al problema de rotación
La aplicación implementa correctamente la persistencia de datos durante cambios de configuración (como la rotación de pantalla) utilizando:
- **ViewModel**: Para sobrevivir a la recreación de la Activity
- **LiveData**: Para observar cambios en los datos
- **startActivityForResult**: Para resetear el marcador solo al volver de ScoreActivity

### Data Binding
El proyecto utiliza Data Binding para vincular directamente los datos del ViewModel con la UI, reduciendo el código y mejorando la legibilidad.

### Capturas de pantalla

##Gana Local

<img width="390" height="801" alt="pantalla_Main" src="https://github.com/user-attachments/assets/80c4e276-5a18-46ad-a79a-ab5c10e88244" />
<img width="391" height="801" alt="local_gana" src="https://github.com/user-attachments/assets/1e348f4e-7e58-4a81-a5a5-76ba9b892019" />

##Gana Visitante

<img width="385" height="800" alt="pantalla_Main_vis" src="https://github.com/user-attachments/assets/a4b7d6b2-d9ef-42fc-b9c4-cd981ae3b145" />
<img width="384" height="799" alt="vis_gana" src="https://github.com/user-attachments/assets/73c60e7b-b8c8-4de1-bb3e-b055a8e4a026" />

##Empate

<img width="376" height="794" alt="pantalla_Main_empate" src="https://github.com/user-attachments/assets/d17c1a16-bfe6-44d9-a33e-2e697292587b" />
<img width="372" height="802" alt="empate" src="https://github.com/user-attachments/assets/7ae6572b-fae0-4f23-ac33-f9855a96bf89" />
