import React from 'react'
import style from './Card.module.css'
import { TasksContext } from '../contexts/Contexts'

export const Card = () => {
    const { tasks, dispatch } = React.useContext(TasksContext)
    const taskDeleteHandler = (id) => {
        dispatch({
            type: "DELETE-TASK",
            payload: id
        })
    }
    return (tasks.map((task) => (
        <div key={task.id} className={style.card}>
            <h1>Tarefa: {task.action}</h1>
            <h2>Tempo: {task.time} mins</h2>
            <button onClick={() => taskDeleteHandler(task.id)}>Delear</button>
        </div>
    )))
}

