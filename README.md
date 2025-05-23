

# 🌱 Plateforme de Charité — Projet JEE / Spring Boot

Bienvenue sur **Plateforme de Charité**, une application web complète pour la gestion d'utilisateurs, d'organisations caritatives, et de dons.  
Ce projet a été développé dans le cadre d’un projet académique avec Spring Boot, Thymeleaf, PostgreSQL et Bootstrap.

---

## 🚀 Fonctionnalités principales

- 🔐 Authentification sécurisée (utilisateur, superadmin, organisation)
- 🏠 Page d'accueil dynamique
- 🧑‍💼 Tableau de bord utilisateur avec profil & actions favorites
- 🏢 Tableau de bord organisation avec gestion des campagnes
- 🛡️ Espace superadmin avec validation d'organisations
- 📄 Modales personnalisées pour modification de profil et mot de passe
- 📦 Upload d'images/logo (base64)

---

## 🛠️ Technologies utilisées

- **Backend :** Spring Boot, Spring Security, Spring MVC
- **Frontend :** Thymeleaf, Bootstrap 5, HTML/CSS
- **Base de données :** PostgreSQL
- **Sécurité :** JWT ou Session-based auth
- **Build :** Maven

---

## 🧪 Installation (locale)

### Prérequis

- Java 17+
- Maven
- PostgreSQL installé et un schéma de base créé (ex: `charitydb`)

### Étapes

```bash
# 1. Clonez le projet
git clone https://github.com/<votre-nom-utilisateur>/charity-platform.git
cd charity-platform

# 2. Configurez votre base de données
#   (dans src/main/resources/application.properties)

# 3. Lancez le projet
mvn spring-boot:run

Presentation Link : https://www.figma.com/deck/s504jhHibwZerXZcOfNug3/Mobile-Product-Review?node-id=1-494&t=ocxHyPHc70UIvnbU-1
