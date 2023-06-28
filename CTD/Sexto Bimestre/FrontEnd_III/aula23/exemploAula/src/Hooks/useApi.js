import React from 'react'
import { baseUrl } from '../api'

export function useApi() {
    const [data, setData] = React.useState()
    const [isLoading, setIsLoading] = React.useState(false)
    const [error, setError] = React.useState(null)

    const shouldFetch = async (endpoint, method, data) => {
        try {
            setData(null)
            setIsLoading(true)
            setError(false)
            if (method === 'POST') {
                const response = fetch(`${baseUrl}/${endpoint}`, data)
                setData(response.data)
            }
            if (method === 'GET') {
                const response = fetch(`${baseUrl}/${endpoint}`)
                setData(response.data)
            }
        } catch (error) {
            setData(null)
            setError(error)
            console.error("Error:", error)
        } finally {
            setIsLoading(false)
        }
    }
    return { data, isLoading, error, shouldFetch }
}   