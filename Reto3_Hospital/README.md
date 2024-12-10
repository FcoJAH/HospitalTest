# Reto 3: Implementación del CRUD para Empleado

## Descripción

Este reto consiste en implementar un CRUD completo para gestionar los registros de los **Empleados** dentro de la aplicación hospitalaria. Los empleados tienen un **ID**, **nombre**, **puesto**, **salario**, y **fecha de ingreso**. A continuación, se describen los pasos para crear, leer, actualizar y eliminar registros de empleados.

## Endpoints del CRUD

### 1. **Crear un nuevo empleado (POST)**

- **URL**: `/empleados`
- **Método**: `POST`
- **Descripción**: Crea un nuevo empleado.
- **Body**:
  ```json
  {
    "nombre": "Juan Pérez",
    "puesto": "Gerente",
    "salario": 50000,
    "fechaIngreso": "2024-01-01"
  }

### 2. **Obtener todos los empleados (GET)
- **URL**: /empleados
- **Método**: GET
- **Descripción**: Obtiene la lista de todos los empleados.

### 3. **Obtener un empleado por ID (GET)
- **URL**: /empleados/{idEmpleado}
- **Método**: GET
- **Descripción**: Obtiene un empleado específico por su ID.
- **Parámetro**: idEmpleado (número entero)

### 4. **Actualizar un empleado (PUT)
- **URL**: /empleados/{idEmpleado}
- **Método**: PUT
- **Descripción**: Actualiza los detalles de un empleado existente.
- **Parámetro**: idEmpleado (número entero)

### 5. **Eliminar un empleado (DELETE)
- **URL**: /empleados/{idEmpleado}
- **Método**: DELETE
- **Descripción**: Elimina un empleado específico por su ID.
- **Parámetro**: idEmpleado (número entero)
