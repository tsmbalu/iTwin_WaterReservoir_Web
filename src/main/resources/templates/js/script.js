// script.js
document.addEventListener('DOMContentLoaded', () => {
    const form = document.getElementById('data-form');

    form.addEventListener('submit', async (e) => {
        e.preventDefault();

        const location = form.elements['location'].value;
        const waterLevel = form.elements['water-level'].value;
        const pH = form.elements['ph'].value;

        try {
            const response = await fetch('/submit-data', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json'
                },
                body: JSON.stringify({ location, waterLevel, pH })
            });

            const data = await response.json();
            alert(data.message); // Show success message
            form.reset(); // Reset form fields
        } catch (error) {
            console.error('Error:', error);
            alert('Something went wrong'); // Show error message
        }
    });
});
