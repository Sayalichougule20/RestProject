**Music System**

This project is a web-based **Music System** built using **Java Spring Boot, Angular, and MySQL**. It provides a platform for users to listen to music, create playlists, and manage songs. Administrators can manage the music library, user accounts, and send notifications.

### Features

**User Features:**
- **User Login & Registration** – Users can sign up and log in securely.
- **Music Library** – Browse and play songs from the collection.
- **Playlist Management** – Users can create, update, and delete playlists.
- **Audio Streaming** – Listen to music directly from the application.
- **Search & Filter** – Search songs by artist, genre, and album.

**Admin Features:**
- **Admin Login** – Secure authentication for administrators.
- **Manage Songs** – Add, update, and delete tracks.
- **Manage Users** – View and manage registered users.
- **Send Notifications** – Admins can notify users about updates.

### Technologies Used
- **Backend:** Java Spring Boot (REST API)
- **Frontend:** Angular (TypeScript, HTML, CSS)
- **Database:** MySQL
- **Testing:** Postman (API testing)
- **Project Management:** Agile methodologies

### Database Schema - musicdb

The system includes multiple tables:
1. **admin** – Stores administrator details.
2. **users** – Contains user credentials and profile information.
3. **songs** – Stores song metadata such as title, artist, album, and duration.
4. **playlists** – Stores user-created playlists with associated songs.
5. **notifications** – Stores messages sent to users.

### REST API Endpoints

- **User Authentication:**
  - User Registration
  - User Login

- **Admin Actions:**
  - Add, Update, and Delete Songs
  - Manage Users
  - Send Notifications

- **User Actions:**
  - Browse Songs
  - Create and Manage Playlists
  - Play Music

### Screenshots

1. **Home Page** – A landing page introducing the application.
 ![WhatsApp Image 2025-02-07 at 06 48 00_65c17bc4](https://github.com/user-attachments/assets/fa861221-67af-4f27-b656-c9ff54096b14)

2.**Registration Form**-Form of registration.
   ![WhatsApp Image 2025-02-07 at 06 54 51_0bf0f062](https://github.com/user-attachments/assets/61253b20-8c3f-4456-849a-dcfab5e2c516)

3. **User Login Page** – Secure login form for users.
  ![WhatsApp Image 2025-02-07 at 06 29 56_24847ce9](https://github.com/user-attachments/assets/5f5ec28b-8cde-4c85-9419-9b55daed12c9)

4. **Admin Dashboard** – Interface to manage songs, users, and notifications.
![WhatsApp Image 2025-02-07 at 06 46 17_21cc2ce9](https://github.com/user-attachments/assets/29b603cb-8eb2-4db3-81f9-95c147faa0a4)

5. **User Dashboard** – Allows users to browse music and manage playlists.
  ![WhatsApp Image 2025-02-07 at 06 30 37_e85068c6](https://github.com/user-attachments/assets/00122b08-059b-4bf9-a07b-f712b6cd4aa5)

6. **Playlist Page**-Allow user to play the song
![WhatsApp Image 2025-02-07 at 06 51 51_fa757365](https://github.com/user-attachments/assets/5de3f04d-43e0-4bbb-baf8-609d6f9482d5)


 
### Installation Guide

1. **Clone the repository:**
   `git clone https://github.com/Sayalichougule20/RestProject.git`

2. **Backend Setup:**
   - Configure MySQL database in `application.properties`.
   - Run the Spring Boot application.

3. **Frontend Setup:**
   - Install dependencies and start the Angular server.

4. **Access the Application:**
   - Open `http://localhost:4200` in the browser.

### About

The Music System is a web-based application designed to provide a seamless music management experience. Built using Java Spring Boot for the backend, Angular for the frontend, and MySQL for data storage, this project enables users to browse, play, and manage music effortlessly.

The system features user authentication, allowing users to create and manage their playlists, while administrators have the ability to add, update, and delete songs. Admins can also manage user accounts and send important notifications.

Following Agile methodologies, this project ensures a scalable and flexible development process, incorporating continuous feedback and improvements. Postman was used extensively to test and validate REST API endpoints, ensuring a smooth and reliable backend service.

This application not only enhances user experience but also showcases robust software development practices, focusing on efficiency, usability, and scalability.

### Resources

Readme | Stars: 0 | Watchers: 1 | Forks: 0

### Languages Used

- Java Spring Boot – 50%
- Angular (TypeScript, HTML, CSS) – 40%
- MySQL – 10%

