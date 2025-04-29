# Parrot - 🔄 LAN File Sharing App

A lightweight, cross-platform desktop application for **secure and fast file sharing over local networks (LAN)** — no internet required. Devices on the same network can discover each other automatically and transfer files using encrypted TCP connections.

---

## 🚀 Features

- 📡 **Peer Discovery** – Detect devices on LAN using UDP broadcast
- 📁 **File Transfer** – Send/receive large files over TCP with progress tracking
- 🔒 **AES-256 Encryption** – End-to-end encryption for all data transfers
- 📊 **Transfer History** – See recent sent and received files
- 🖥️ **Drag-and-Drop UI** – Built with a clean desktop interface
- 🌐 **No Internet Required** – Works entirely offline within a LAN

---

## 📸 Screenshots

> _Screenshots and Gifs will soon be displayed for file transfer, peer discovery, and UI._

---

## 🛠️ Tech Stack

| Layer     | Technology                                           |
|-----------|------------------------------------------------------|
| Language  | Java                                                 |
| UI        | Swing                                                |
| Network   | TCP (for transfer), UDP (for peer discovery)         |
| Security  | AES-256 (with shared symmetric key)                  |
| Storage   | Local file system (with SQLite optional for history) |

---

## 📦 Installation

### Option 1: Download Executable
- _Coming soon_: Prebuilt binaries for Windows/Linux/MacOS

### Option 2: Run from Source

```bash
# Clone repository
git clone https://github.com/yourusername/lan-file-sharing-app.git
cd lan-file-sharing-app

# Compile and run (Java version example)
javac Main.java
java Main
