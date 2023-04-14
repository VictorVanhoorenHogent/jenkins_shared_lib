def call () {
    sh"""
    terraform init
    terraform plan  --var-file=./config/terraform.tfvars
    terraform apply --var-file=./config/terraform.tfvars --auto-approve
    """


}