import React, { useState } from 'react';
import axios from 'axios';

const UserForm = () => {
    const [user, setUser] = useState({ name: '', email: '' });

    const handleSubmit = (event) => {
        event.preventDefault();

        axios.post('http://localhost:8080/save', user)
            .then(response => {
                // Handle the response
            })
            .catch(error => {
                // Handle the error
            });
    };

    return (
        <form onSubmit={handleSubmit}>
            <input type="text" name="name" placeholder="Name" /><br></br>
            <input type="email" name="email" placeholder="Email" /><br></br>
            <button type="submit">Submit</button>
        </form>
    );
};

export default UserForm;