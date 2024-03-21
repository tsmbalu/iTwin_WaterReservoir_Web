// submit.js
// JavaScript to handle marker submission

// Function to submit marker data for a report incident
function submitIncident() {
    // Collect incident data (location, type, description)
    const incidentData = {
        location: 'Some location',
        type: 'Type of incident',
        description: 'Description of incident'
    };

    // Send the data to the server using fetch or another AJAX method
    fetch('/submit-incident', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(incidentData)
    })
    .then(response => {
        // Handle response from the server (display success message)
        console.log('Incident submitted successfully');
    })
    .catch(error => {
        // Handle error (e.g., display error message)
        console.error('Error submitting incident:', error);
    });
}

// Function to submit marker data for a water source
function submitWaterSource() {
    
    const waterSourceData = {
        location: 'Some location',
        type: 'Type of water source',
        description: 'Description of water source'
    };

    fetch('/submit-water-source', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(waterSourceData)
    })
    .then(response => {
        // Handle response from the server (display success message)
        console.log('Water source submitted successfully');
    })
    .catch(error => {
        // Handle error (display error message)
        console.error('Error submitting water source:', error);
    });
}
