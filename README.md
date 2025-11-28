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

## Instalación

1. Clona este repositorio:
```bash
git clone https://github.com/tu-usuario/tablero-basket.git
```

2. Abre el proyecto en Android Studio

3. Sincroniza el proyecto con Gradle

4. Ejecuta la aplicación en un emulador o dispositivo físico

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
