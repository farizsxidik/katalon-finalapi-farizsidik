# katalon-finalapi-farizsidik

# API Testing Documentation with Katalon Studio

This documentation covers the setup and execution of API tests for the Restful Booker platform using Katalon Studio. The primary focus is on authenticating, creating, retrieving, and listing bookings.

## Overview

The API testing project includes several key components organized within Katalon Studio:

- **Test Cases:** Scripts designed to test individual API functionalities.
- **Object Repository:** Predefined API requests for various operations.

## Object Repository

The Object Repository contains the following API requests essential for testing:

- **POST Auth:** Authenticate users and retrieve a token for session management.
- **POST CreateBooking:** Submit new booking details.
- **GET GetBooking:** Retrieve the details of a specific booking by ID.
- **GET GetBookingIDs:** List all booking IDs, with optional filters.

## Test Cases

### TC_Auth_GetToken

Authenticates a user and saves the authentication token for subsequent requests.

### TC_CreateBooking

Creates a new booking entry using the authenticated session.

### TC_GetBooking

Retrieves the details of a specific booking, utilizing the booking ID obtained either statically or from previous test case executions.

### TC_GetBookingIDs

Lists all booking IDs available in the system, which can be used to test the retrieval of booking details in a dynamic and scalable manner.

## Setup and Execution

1. **Environment Setup:** Ensure Katalon Studio is installed and configured on your machine.
2. **Project Configuration:** Import the project from the provided source control link or directly configure the test cases and object repository as outlined.
3. **Running Tests:** Tests can be executed individually or as part of a Test Suite for integrated scenarios.

## Results and Reporting

After executing the tests, Katalon Studio provides detailed reports on each test case's outcome, including success status, response data, and any assertions applied for validation.

## Customization

This template can be customized to fit specific testing requirements, including adding new test cases, modifying existing requests in the Object Repository, and adjusting assertions based on the expected outcomes.

For detailed instructions, refer to the accompanying documentation in the [Google Drive folder](https://drive.google.com/drive/folders/1ipRb30IXrWx01ca1lzFXDUFe72_XXkfa?usp=sharing).

