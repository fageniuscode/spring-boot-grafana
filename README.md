# spring-boot-grafana
Spring boot monitoring application using grafana and prometheus.
```bash
  Les serveurs grafana et prometheus sont installés sur la machine local
```
```bash
  Pour le mail qui va réceptionner les alertes,
  Modifier le fichier defaults de grafan "C:\m2gl\grafana-9.3.6\conf"
  [smtp]
  enabled = true
  host = smtp.gmail.com:465
  host = smtp.gmail.com:465
  user = adresse email qui va recevoir les alertes
  password = mot de passe de l'addresse email
```
```bash
  Par mesure de sécurité, google bloque l'envoie de mails à partir d'un service smtp
  Pour que cela puisse passé, modifier les paramètres de votre compte google en activant la 
  validation en deux étapes en cliquant sur sécurité.
  pour ensuite définir un mot de passe pour les applications
```
```bash
  Démarrer prometheus et grafana 
```

