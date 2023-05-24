export const MyInput = ({ label, value, type, fnOnChange }) => {
    return (
        <div>
            <label>{label}</label>
            <br />
            <input
                type={type}
                value={value}
                onChange={fnOnChange}
            />
        </div>
    )
}