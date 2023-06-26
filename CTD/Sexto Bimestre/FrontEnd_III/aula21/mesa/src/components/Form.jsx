import React from "react"
import style from './Form.module.css'
import { TasksContext } from "../contexts/Contexts"

export const Form = () => {
    const [taskInputText, setTaskInputText] = React.useState("")
    const [taskInputTime, setTaskInputTime] = React.useState(0)

    const { tasks, dispatch } = React.useContext(TasksContext)

    const taskTextInputHandler = React.useCallback((event) => {
        setTaskInputText(event.target.value)
    }, [taskInputText])
    const taskTimeInputHandler = React.useCallback((event) => {
        setTaskInputTime(event.target.value)
    }, [taskInputTime])
    const createTaskHandler = React.useCallback((event) => {

        event.preventDefault()
        if (!taskInputText) return

        const newTask = {
            id: parseInt(Date.now() * Math.random()),
            action: taskInputText,
            time: taskInputTime
        }
        dispatch({
            type: "CREATE-TASK",
            payload: [newTask, ...tasks]
        })
        setTaskInputText("")
        setTaskInputTime(0)
    }, [event])

    return (
        <form className={style.form}>
            <div className={style.input}>
                <label>Tarefa: </label>
                <input
                    type="text"
                    placeholder="Tarefa"
                    value={taskInputText}
                    onChange={taskTextInputHandler}
                />
            </div>
            <div>
                <label>Tempo: </label>
                <input
                    type="number"
                    min={0}
                    value={taskInputTime}
                    onChange={taskTimeInputHandler}
                />
            </div>
            <div className={style.button}>
                <button onClick={createTaskHandler}>Adicionar</button>
            </div>
        </form>
    )
}
