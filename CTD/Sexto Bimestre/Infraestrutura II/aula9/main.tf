provider "aws" {
    region = "vars.aws_region"
}

module "securitygroup" {
    source = "./modulos/security-group"
    namespace = "var.namespace"
    my_vpc_id = "var.my_vpc_id"
}